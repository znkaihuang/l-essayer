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
		
		// response.setContentType("text/html");
		// PrintWriter out = response.getWriter();
		// out.println("Beer Selection Advice<br>");
		// String c = request.getParameter("word");
		
		
		// BeerExpert be = new BeerExpert();
		List result = new ArrayList<String>();
		result.add(request.getParameter("word"));
		result.add(request.getParameter("type"));
		result.add(request.getParameter("conjug_declin"));
		result.add(request.getParameter("definition"));
		result.add(request.getParameter("example"));
		
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}
}
