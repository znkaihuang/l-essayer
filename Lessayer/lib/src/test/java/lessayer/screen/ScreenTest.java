package lessayer.screen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Map;

import org.junit.jupiter.api.Test;

import lessayer.word.Word;

class ScreenTest {

	@Test
	void printWelcomScreenTest() {
		WelcomeScreen welcome = new WelcomeScreen();
		welcome.printWelcome();
	}
	
	@Test
	void menuScreenTest() {
		MenuScreen menu = new MenuScreen();
		menu.printSelection();
		menu.readSelection();
	}
	
	@Test
	void memorizeWordsScteenTest() {
		MemorizeWordsScreen memorizeWords = new MemorizeWordsScreen();
		memorizeWords.printSelection();
		memorizeWords.readSelection();
	}
	
	@Test
	void enterWordScreenTest() {
		EnterWordScreen enterWord = new EnterWordScreen();
		Word word = enterWord.readWord();
		enterWord.printWord(word);
		enterWord.continueOrQuit();
	}
	
	@Test
	void spellingQuizScreenInitializeTest() {
		SpellingQuizScreen spellingQuiz = new SpellingQuizScreen();
		spellingQuiz.initaillize();
		
		Map<Integer, String> dictionaryPair = spellingQuiz.getDictionaryPair();
		ArrayList<Integer> indexList = spellingQuiz.getIndexList();
		
		for(Integer index : indexList) {
			System.out.printf("%-3d: %-20s\n", index, dictionaryPair.get(index));
		}
	}
	
	@Test
	void spellingQuizScreenTest() {
		SpellingQuizScreen spellingQuiz = new SpellingQuizScreen();
		spellingQuiz.initaillize();
		spellingQuiz.showInterface();
		spellingQuiz.startQuiz();
	}
}
