package lessayer.word;

public class Adjective extends Word {
	final static private String[] declensionList = {"masulinePlural", "feminineSingular", "femininePlural"};
	
	public Adjective(String word) {
		// TODO Auto-generated constructor stub
		super(word);
		this.setType("adjective");
	}
	
	@Override
	public void printWord() {
		System.out.println(this.getWord() + " adj.");
		System.out.println("Print the declension table.");
		for(String declen : Adjective.declensionList) {
			System.out.println(declen + ": " + this.getDeclension().get(declen));
		}
		System.out.println("Définition:\n" + this.getDefinition());
		System.out.println("Exemple:\n" + this.getExampleSentence());
	}
	
	public static String[] getDeclensionlist() {
		return declensionList;
	}

}
