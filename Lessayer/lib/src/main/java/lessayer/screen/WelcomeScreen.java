package lessayer.screen;

public class WelcomeScreen {
	private String welcomString;
	
	public WelcomeScreen() {
		welcomString = "Bienvenue!";
	}
	
	public void printWelcome() {
		// TODO Auto-generated method stub
		StringBuilder frameBorder = new StringBuilder();
		for(int index = 0; index < this.welcomString.length() + 2; index++) {
			frameBorder.append('=');
		}
		
		System.out.println(frameBorder);
		System.out.println(" " + this.welcomString + " ");
		System.out.println(frameBorder);
	}

}
