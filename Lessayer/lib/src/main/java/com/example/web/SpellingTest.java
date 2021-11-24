package com.example.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.model.PrepareQuestion;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SpellingTest extends HttpServlet {
	
	public void doGet(HttpServletRequest request, 
			HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		
		PrepareQuestion prepareQuestion = new PrepareQuestion();
		ArrayList<HashMap<String, String>> questionArray = prepareQuestion.getQuestionArray();
		request.setAttribute("questions", questionArray);
		
		StringBuilder answers = new StringBuilder();
		for(String answer : prepareQuestion.getAnswerArray()) {
			answers.append(answer + "&");
		}
		Cookie cookie = new Cookie("answers", answers.toString());
		cookie.setMaxAge(30 * 60);
		response.addCookie(cookie);
		
		RequestDispatcher view = request.getRequestDispatcher("spellingTest.jsp");
		view.forward(request, response);
	}
	
}
