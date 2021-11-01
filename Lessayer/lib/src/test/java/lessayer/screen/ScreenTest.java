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
	void selectionScreenTest() {
		SelectionScreen selection = new SelectionScreen();
	}
}
