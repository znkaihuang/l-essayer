package lessayer.screen;

<<<<<<< HEAD
public class WelcomeScreen {
	private String welcomString;
	
	public WelcomeScreen() {
=======
public class WelcomScreen {
	private String welcomString;
	
	public WelcomScreen() {
>>>>>>> branch 'main' of git@github.com:znkaihuang/l-essayer.git
		welcomString = "Bienvenue!";
	}
	
	public void printWelcom() {
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
