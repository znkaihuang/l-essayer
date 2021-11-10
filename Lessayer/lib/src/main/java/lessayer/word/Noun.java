package lessayer.word;

public class Noun extends Word {
	final static private String[] propertyList = {"gender"};
	final static private String[] declensionList = {"plural"};
	
	public Noun(String word) {
		// TODO Auto-generated constructor stub
		super(word);
		this.setType("noun");
	}
	
	@Override
	public void printWord() {
		System.out.println(this.getWord() + " n." + this.getProperty().get("gender").charAt(0));
		System.out.println("Définition:\n" + this.getDefinition());
		System.out.println("Exemple:\n" + this.getExampleSentence());
	}

	public static String[] getPropertylist() {
		return propertyList;
	}

	public static String[] getDeclensionlist() {
		return declensionList;
	}	
}
