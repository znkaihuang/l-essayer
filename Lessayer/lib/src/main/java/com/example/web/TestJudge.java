package com.example.web;

import java.io.IOException;
import java.util.ArrayList;

import com.example.model.PrepareQuestion;

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
        
        ArrayList <String> correctAnswers = new ArrayList<>();
        ArrayList <String> userAnswers = new ArrayList<>();
        ArrayList <String> results = new ArrayList<>();
        if(cookies != null) {
        	for(int i = 0; i < cookies.length; i++) {
        		Cookie cookie = cookies[i];
        		if(cookie.getName().matches("correct-answer-[1-9][0-9]*")) {
        			correctAnswers.add(cookie.getValue());
        		}
        	}
        }
        
        for(int questionId = 1; questionId <= PrepareQuestion.getQuestionNum(); questionId++ ) {
        	userAnswers.add(request.getParameter("user-answer-" + String.valueOf(questionId)));
        }
        
        int score = 0;
        for(int i = 0; i < userAnswers.size(); i++) {
        	String judgement = "Votre réponse est \"" + userAnswers.get(i) + "\".<br>" +
        			"La bonne réponse est \"" + correctAnswers.get(i) + "\".<br>";
        	results.add(judgement);
        	if(correctAnswers.get(i).equals(userAnswers.get(i))) {
        		score++;
        	}
        }
        
        request.setAttribute("results", results);
        request.setAttribute("score", score);
        
        RequestDispatcher view = request.getRequestDispatcher("quiz-score.jsp");
		view.forward(request, response);
	}
	
}
