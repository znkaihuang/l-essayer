package com.example.model;

import java.util.ArrayList;
import java.util.HashMap;

import lessayer.word.ReadWriteWord;

public class PrepareQuestion {
	private int questionNum = 5;
	private ArrayList<HashMap<String, String>> questionArray;
	private ArrayList<String> answerArray;

	public PrepareQuestion() {
		 questionArray = ReadWriteWord.loadWordFromDatabase(this.questionNum);
		 answerArray = new ArrayList<>();
		 
		 for(HashMap<String, String> question : questionArray) {
			 String answer = question.get("word");
			 String markAnswer = answer.charAt(0) + "___" + answer.charAt(answer.length() - 1);
			 String exampleSentence = question.get("example");
			 question.put("example", exampleSentence.replace(answer, markAnswer));
			 answerArray.add(answer);
		 }
	}
	
	public int getQuestionNum() {
		return questionNum;
	}

	public void setQuestionNum(int questionNum) {
		this.questionNum = questionNum;
	}
	
	public ArrayList<HashMap<String, String>> getQuestionArray() {
		return questionArray;
	}
	
	public ArrayList<String> getAnswerArray() {
		return answerArray;
	}
}
