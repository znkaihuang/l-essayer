package lessayer.word;

public class Noun extends Word {
	private String gender;
	private String plural;
	
	public Noun(String word) {
		super(word);
		// TODO Auto-generated constructor stub
		this.setType("noun");
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	@Override
	public void printWord() {
		System.out.println(this.getWord() + " n." + this.getGender().charAt(0) + ".");
		System.out.println("Définition:\n" + this.getDefinition());
		System.out.println("Exemple:\n" + this.getExampleSentence());
	}

	public String getPlural() {
		return plural;
	}

	public void setPlural(String plural) {
		this.plural = plural;
	}
}
