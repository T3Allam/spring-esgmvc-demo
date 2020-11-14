package com.tal.jdbc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set up connection username and pass - not good practice :)
		String user = "adminpage";
		String pass = "adminpage";
		String jdbcUrl = "jdbc:mysql://localhost:3306/rr_admin?useSSL=false";
		String driver = "com.mysql.cj.jdbc.Driver";
		//get connection to database
		try {
			PrintWriter out = response.getWriter();
			out.println("Connecting to db: " +jdbcUrl);
			Class.forName(driver);
			//get connection
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			out.println("Successful connection");
			myConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
