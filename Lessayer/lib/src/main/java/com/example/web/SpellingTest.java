package com.example.web;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SpellingTest extends HttpServlet {
	
	private int questionId = 1;
	
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		request.setAttribute("questionID", questionId);
		
		RequestDispatcher view = request.getRequestDispatcher("spellingTest.jsp");
		view.forward(request, response);
		questionId++;
	}
	
}
