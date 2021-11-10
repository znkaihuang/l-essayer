package lessayer.word;

import java.util.HashMap;

public class Word {
	protected String word;
	protected String type;
	protected String definition;
	protected String exampleSentence;
	protected HashMap<String, String> property;
	protected HashMap<String, String> conjugation;
	protected HashMap<String, String> declension;
	
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
	
	// Verb class must override the two methods: getConjugation() and setConjugation().
	public HashMap<String, String> getConjugation() {
		return conjugation;
	}
	
	public void setConjugation(HashMap<String, String> conjugation) {
		this.conjugation = conjugation;
	}

	// Noun and Adjective classes must override the two methods: getDeclension() and setDeclension().
	public HashMap<String, String> getDeclension() {
		return declension;
	}

	public void setDeclension(HashMap<String, String> declension) {
		this.declension = declension;
	}
	
	// Noun class has property "gender" which can be either "masculin" or "feminin".
	public HashMap<String, String> getProperty() {
		return property;
	}

	public void setProperty(HashMap<String, String> property) {
		this.property = property;
	}
}
