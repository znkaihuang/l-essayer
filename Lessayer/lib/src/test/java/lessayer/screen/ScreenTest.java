package lessayer.screen;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
