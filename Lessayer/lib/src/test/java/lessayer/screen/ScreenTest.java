package lessayer.screen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ScreenTest {

	@Test
	void printWelcomScreenTest() {
		WelcomScreen welcom = new WelcomScreen();
		welcom.printWelcom();
	}
	
	@Test
	void manuScreenTest() {
		ManuScreen manu = new ManuScreen();
	}
	
	@Test
	void memorizeWordsScteenTest() {
		MemorizeWordsScreen memorizeWords = new MemorizeWordsScreen();
	}
	
	@Test
	void enterWordScreenTest() {
		EnterWordScreen enterWord = new EnterWordScreen();
	}
}
