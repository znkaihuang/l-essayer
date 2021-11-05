package lessayer.screen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lessayer.word.ReadWriteWord;
import lessayer.word.Word;

public class SpellingQuizScreen {
	private Map<Integer, String> dictionaryPair;
	private ArrayList<Integer> indexList;
	
	public SpellingQuizScreen() {
		
	}

	public void showInterface() {
		// TODO Auto-generated method stub
		String titleString = "Test d'orthographe "; // Spelling test
		StringBuilder frameBorder = new StringBuilder();
		for(int index = 0; index < titleString.length() + 2; index++) {
			frameBorder.append('=');
		}
		
		System.out.println(frameBorder);
		System.out.println(" " + titleString + " ");
		System.out.println(frameBorder);
		System.out.println("Commencez le test!!!\n");
	}

	public void startQuiz() {
		// TODO Auto-generated method stub
		Integer questionCount = 10;
		
		for(Integer question = 1; question <= questionCount; question++) {
			String correctAnswer = dictionaryPair.get(indexList.get(question - 1));
			showQuestionAndHint(question, correctAnswer);
			String userAnswer = readAnswer();
			checkAnswer(userAnswer, correctAnswer);
			if(question < 10) {
				if(!continueOrQuit()) {
					break;
				}
			}
		}
		System.out.println("Le quiz se termine.");
	}

	public void initiallize() {
		// TODO Auto-generated method stub
		loadWordsFromDictionary();
		shuffleWordIndex();
	}
	
	private void checkAnswer(String userAnswer, String correctAnswer) {
		// TODO Auto-generated method stub
		if(correctAnswer.compareTo(userAnswer) != 0) {
			System.out.println("La bonne réponse est \"" + correctAnswer + "\".");
		}
		else {
			System.out.println("Félicitation. Votre réponse est correcte!");
		}
	}
	
	// Return true to continue and false to quit
	private boolean continueOrQuit() {
		// TODO Auto-generated method stub
		System.out.println("Continuez? (Y/n)");
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String continueOrQuit = null;
		try {
			continueOrQuit = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(continueOrQuit.compareTo("Y") == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private String readAnswer() {
		// TODO Auto-generated method stub
		System.out.print("R: ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String userAnswer = null;
		try {
			userAnswer = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userAnswer;
	}

	private void showHint(Word answerWord) {
		// TODO Auto-generated method stub
		System.out.printf("(indice: %s)\n", answerWord.getDefinition());
	}

	private void showQuestionAndHint(Integer questionID, String correctAnswer) {
		// TODO Auto-generated method stub
		Word answerWord;
		
		answerWord = ReadWriteWord.loadWord(correctAnswer);
		String markAnswer = correctAnswer.charAt(0) + "___" + correctAnswer.charAt(correctAnswer.length() - 1);
		String question = answerWord.getExampleSentence().replace(correctAnswer, markAnswer);
		System.out.printf("Q%d: %s\n", questionID, question);
		
		showHint(answerWord);
	}
	
	private void shuffleWordIndex() {
		// TODO Auto-generated method stub
		indexList = new ArrayList<>(dictionaryPair.keySet());
		Collections.shuffle(indexList);
	}

	// Would using MySQL in the future. MySQL offers method to random select data,
	// Just a first thought here.
	private void loadWordsFromDictionary() {
		// TODO Auto-generated method stub
		File indexFile = new File(ReadWriteWord.getIndexFilePath());
		dictionaryPair = new HashMap<>();
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(indexFile))) {
			String wordString;
			int count = 0;
			while((wordString = bufferedReader.readLine()) != null) {
				dictionaryPair.put(count++, wordString);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Integer> getIndexList() {
		// TODO Auto-generated method stub
		return this.indexList;
	}

	public Map<Integer, String> getDictionaryPair() {
		// TODO Auto-generated method stub
		return this.dictionaryPair;
	}
}
