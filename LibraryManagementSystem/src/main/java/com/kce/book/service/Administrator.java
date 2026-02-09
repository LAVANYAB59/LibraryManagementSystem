package com.kce.book.service;

import com.kce.book.bean.BookBean;
import com.kce.book.dao.BookDAO;

public class Administrator {
     public String addBook(BookBean bookBean) {

    	    if (bookBean == null
    	        || bookBean.getIsbn() == null || bookBean.getIsbn().isEmpty()
    	        || bookBean.getBookName() == null || bookBean.getBookName().isEmpty()
    	        || (bookBean.getBookType() != 'G' && bookBean.getBookType() != 'T')
    	        || bookBean.getCost() <= 0   
    	        || bookBean.getAuthor() == null
    	        || bookBean.getAuthor().getAuthorName().isEmpty()) {

    	        return "INVALID";
    	    }
    		 BookDAO dao=new BookDAO();
    		 int result=dao.createBook(bookBean);
    		 if(result>0)
    			 return "SUCCESS";
    		 else
    			 return "FAILURE";
    	
     }
     public BookBean viewBook(String ISBN) {
    	BookDAO bookDAO=new BookDAO();
    	return bookDAO.fetchBook(ISBN);
     }
}
