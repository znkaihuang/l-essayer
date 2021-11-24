package com.example.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TestJudge extends HttpServlet {
	
	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
        	for(int i = 0; i < cookies.length; i++) {
        		Cookie cookie = cookies[i];
   				System.out.println(cookie.getValue());
        	}
        }
		
        RequestDispatcher view = request.getRequestDispatcher("quiz-score.jsp");
		view.forward(request, response);
	}
	
}
