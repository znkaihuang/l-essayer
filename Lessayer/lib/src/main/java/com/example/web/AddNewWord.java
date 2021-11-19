package com.example.web;

import com.example.model.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;

public class AddNewWord extends HttpServlet {
	
	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException, ServletException {
		
		// BeerExpert be = new BeerExpert();
		String word = request.getParameter("word");
		String type = request.getParameter("type").toUpperCase();
		String conjug_declin = request.getParameter("conjug_declin");
		String definition = request.getParameter("definition");
		String example = request.getParameter("example");
		
		request.setAttribute("word", word);
		request.setAttribute("type", type);
		request.setAttribute("conjug_declin", conjug_declin);
		request.setAttribute("definition", definition);
		request.setAttribute("example", example);
		
		RequestDispatcher view = request.getRequestDispatcher("addWord.jsp");
		view.forward(request, response);
	}
}
