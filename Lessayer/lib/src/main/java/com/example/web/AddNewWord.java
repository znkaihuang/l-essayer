package com.example.web;

import com.example.model.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import lessayer.word.*;
import lessayer.word.ReadWriteWord;

import java.io.*;
import java.util.*;

public class AddNewWord extends HttpServlet {
	
	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		String word = request.getParameter("word");
		String type = request.getParameter("type").toUpperCase();
		String conjug_declin = request.getParameter("conjug_declin");
		String definition = request.getParameter("definition");
		String example = request.getParameter("example");
		
		Word newWord = setWordTypeAndConjugDeclin(word, type, conjug_declin);
		newWord.setDefinition(definition);
		newWord.setExampleSentence(example);
		ReadWriteWord.saveWordToDatabase(newWord);
		
		request.setAttribute("word", word);
		request.setAttribute("type", type);
		request.setAttribute("conjug_declin", conjug_declin);
		request.setAttribute("definition", definition);
		request.setAttribute("example", example);
		
		RequestDispatcher view = request.getRequestDispatcher("addWord.jsp");
		view.forward(request, response);
	}

	private Word setWordTypeAndConjugDeclin(String word, String type, String conjug_declin) {
		// TODO Auto-generated method stub
		Word returnWord = null;
		if(type.compareTo("MASCULIN-NOUN") == 0) {
			Noun noun = new Noun(word);
			HashMap<String, String> property = new HashMap<>();
			property.put("gender", "masculin");
			noun.setProperty(property);
			returnWord = noun;
		}
		else if (type.compareTo("FEMININ-NOUN") == 0) {
			Noun noun = new Noun(word);
			HashMap<String, String> property = new HashMap<>();
			property.put("gender", "féminin");
			noun.setProperty(property);
			returnWord = noun;
		}
//		else if (type.compareTo("verb") == 0) {
//			Verb verb = new Verb(word);
//			returnWord = verb;
//		}
//		else if (type.compareTo("adjective") == 0) {
//			Adjective adjective = new Adjective(word);
//			returnWord = adjective;
//		}
//		else if (type.compareTo("adverb") == 0) {
//			Adverb adverb = new Adverb(word);
//			returnWord = adverb;
//		}
		return returnWord;
	}
}
