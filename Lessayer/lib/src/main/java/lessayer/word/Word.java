package lessayer.word;

public class Word {
	private String word;
	private String type;
	private String definition;
	private String exampleSentence;
	
	public Word(String word) {
		this.word = word;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	public void setExampleSentence(String exampleSentence) {
		this.exampleSentence = exampleSentence;
	}
	
	public String getWord() {
		return this.word;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getDefinition() {
		return this.definition;
	}
	
	public String getExampleSentence() {
		return this.exampleSentence;
	}
	
	public void printWord() {
		System.out.println(this.word);
	}
}
