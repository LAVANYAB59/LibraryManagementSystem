package com.kce.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kce.book.bean.AuthorBean;
import com.kce.book.bean.BookBean;
import com.kce.book.util.DBUtil;

public class BookDAO {
	public int createBook(BookBean bookBean) {

	    Connection connection = DBUtil.getConnection();

	    String query =
	        "INSERT INTO Book_Tbl (ISBN, Book_title, Book_type, Author_code, Book_cost) VALUES (?,?,?,?,?)";

	    try {
	        PreparedStatement ps = connection.prepareStatement(query);

	        ps.setString(1, bookBean.getIsbn());
	        ps.setString(2, bookBean.getBookName());
	        ps.setString(3, String.valueOf(bookBean.getBookType()));
	        ps.setInt(4, bookBean.getAuthor().getAuthorCode());
	        ps.setFloat(5, bookBean.getCost());

	        int rows = ps.executeUpdate();   
	        System.out.println("Rows inserted = " + rows);

	        return rows;

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return 0;
	}
	public BookBean fetchBook(String isbn) {

	    BookBean bookBean = null;

	    Connection connection = DBUtil.getConnection();

	    String query = "SELECT * FROM Book_Tbl WHERE ISBN=?";

	    try {
	        PreparedStatement ps = connection.prepareStatement(query);
	        ps.setString(1, isbn);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {

	            bookBean = new BookBean();

	            bookBean.setIsbn(rs.getString("ISBN"));
	            bookBean.setBookName(rs.getString("Book_title"));
	            bookBean.setBookType(rs.getString("Book_type").charAt(0));
	            bookBean.setCost(rs.getFloat("Book_cost"));
	            bookBean.setAuthor(new AuthorDAO().getAuthor(rs.getInt("Author_code")));
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return bookBean;
	}
}
