📚 Library Management System

A simple Java Web Application built using Servlets, JDBC, and Oracle Database to manage books and authors.
This project demonstrates the MVC (Model–View–Controller) architecture and performs basic operations such as adding a new book and viewing book details using ISBN.

🚀 Features

Add Book
Enter ISBN number
Enter book title
Select book type (Technical or General)
Select author
Enter book cost
Saves book details into the database
View Book
Search book using ISBN
Displays book title, type, author name, author contact, cost, and ISBN
Validation
Prevents empty fields
Ensures valid book type
Cost must be greater than zero
Shows error page for invalid or failed operations

🛠 Technologies Used

Java
Servlets
JDBC
Oracle Database (XE)
HTML
Apache Tomcat

📂 Project Structure

The project is organized into layers following MVC architecture:
Bean Layer
Contains JavaBeans for Author and Book objects.
DAO Layer
Handles all database operations such as inserting and retrieving records.
Service Layer
Contains business logic and validation.
Servlet Layer
Acts as controller to process requests and responses.
Util Layer
Manages database connection.
HTML Pages
Used for user interface such as Add Book, View Book, Menu, Invalid, and Failure pages.

🗄 Database Setup

Create two tables:
Author table to store author details
Book table to store book details with author reference
Insert some sample authors before adding books.

⚙️ Configuration

Update database connection details (URL, username, password) inside the database utility file to match your Oracle setup.
Add the Oracle JDBC driver file into the project library folder.

▶️ How to Run

Import the project into Eclipse or IntelliJ
Configure Apache Tomcat server
Deploy and run the application
Open the browser and access the Menu page
Use the menu to add or view books

🧩 Application Flow

User submits form → Servlet processes request → Service validates → DAO interacts with database → Result displayed to user

🎯 Learning Objectives

This project helps understand:
Java Servlets
JDBC connectivity
Oracle database integration
MVC architecture
Form handling and validation
Session management

🔮 Future Enhancements

Update and delete books
Add new authors
Use JSP instead of HTML
Improve UI design
Add connection pooling
Convert to Spring Boot

👨‍💻 Author
Developed as a learning project for practicing Java Web Development concepts.

📜 License
This project is free to use for educational purposes.

Output:

<img width="494" height="403" alt="image" src="https://github.com/user-attachments/assets/418a87d7-d221-44b0-baa4-d3b4d46b509c" />

<img width="813" height="129" alt="image" src="https://github.com/user-attachments/assets/0b789788-f0bd-4ad6-8dc0-57fe22052a04" />

<img width="644" height="656" alt="image" src="https://github.com/user-attachments/assets/39f86860-22fb-49c9-b6d2-736e1548c288" />



