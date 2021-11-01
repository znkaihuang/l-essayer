package lessayer.word;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordTest {

	@Test
	void wordTest() {
		String definition = "dog";
		String exampleSentence = "Ce qu'il y a de meilleur dans l'homme, c'est le chien.";
		
		Word word = new Word("chien");
		word.setDefinition("dog");
		word.setExampleSentence("Ce qu'il y a de meilleur dans l'homme, c'est le chien.");
		
		assertEquals(definition, word.getDefinition());
		assertEquals(exampleSentence, word.getExampleSentence());
	}
	
	@Test
	void nounTest() {
		String definition = "dog";
		String exampleSentence = "Ce qu'il y a de meilleur dans l'homme, c'est le chien.";
		String gender = "masculine";
		
		Noun word = new Noun("chien");
		word.setDefinition("dog");
		word.setExampleSentence("Ce qu'il y a de meilleur dans l'homme, c'est le chien.");
		word.setGender(gender);
		
		assertEquals("noun", word.getType());
		assertEquals(definition, word.getDefinition());
		assertEquals(exampleSentence, word.getExampleSentence());
		assertEquals(gender, word.getGender());
	}
	
}
