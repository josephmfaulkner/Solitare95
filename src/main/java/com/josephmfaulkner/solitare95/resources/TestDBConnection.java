package com.josephmfaulkner.solitare95.resources;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import javax.annotation.Resource; 

/**
 * Servlet implementation class TestDBConnection
 */
@WebServlet("/TestDBConnection")
public class TestDBConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Resource(name="jdbc/webappdb")
	private DataSource dataSource; 
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDBConnection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Connection connection = null; 
		Statement statement = null; 
		ResultSet results = null; 
		
		try {
			connection = dataSource.getConnection(); 
			statement = connection.createStatement(); 
			
			results = statement.executeQuery("SELECT * FROM PERSON");
			
			while(results.next()) {
				int id = results.getInt("ID");
				String name = results.getString("NAME");
				
				response.getWriter().print(id + " - " + name);
				
				
			}
			
			connection.close();
			statement.close();
			results.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
