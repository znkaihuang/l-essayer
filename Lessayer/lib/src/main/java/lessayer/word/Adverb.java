package lessayer.word;

public class Adverb extends Word {

	public Adverb(String word) {
		// TODO Auto-generated constructor stub
		super(word);
		this.setType("adjective");
	}
	
	@Override
	public void printWord() {
		System.out.println(this.getWord() + " adv.");
		System.out.println("Définition:\n" + this.getDefinition());
		System.out.println("Exemple:\n" + this.getExampleSentence());
	}
}
