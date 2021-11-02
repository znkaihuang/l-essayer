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
	
	@Test
	void saveWordTest() {
		String definition1 = "dog";
		String exampleSentence1 = "Ce qu'il y a de meilleur dans l'homme, c'est le chien.";
		String gender1 = "masculine";
		Noun word1 = new Noun("chien");
		word1.setGender(gender1);
		word1.setDefinition(definition1);
		word1.setExampleSentence(exampleSentence1);
		
		if(ReadWriteWord.saveWord(word1)) {
			System.out.println("Save the word \"" + word1.getWord() + "\" complete!");
		}
		else {
			System.out.println("The word \"" + word1.getWord() + "\" has already existed!");
		}
		
		String definition2 = "wolf";
		String exampleSentence2 = "On n'est pas encore sorti du bois et le loup rôde toujours.";
		String gender2 = "masculine";
		Noun word2 = new Noun("loup");
		word2.setGender(gender2);
		word2.setDefinition(definition2);
		word2.setExampleSentence(exampleSentence2);
		
		if(ReadWriteWord.saveWord(word2)) {
			System.out.println("Save the word \"" + word2.getWord() + "\" complete!");
		}
		else {
			System.out.println("The word \"" + word2.getWord() + "\" has already existed!");
		}
	}
	
	@Test
	void loadWordTest() {
		String string1 = "chien";
		String string2 = "chat";
		Noun word;
		
		if((word = ReadWriteWord.loadWord(string1)) != null) {
			word.printWord();
		}
		else {
			System.out.println("The word \"" + string1 + "\" does not exist.");
		}
		
		if((word = ReadWriteWord.loadWord(string2)) != null) {
			word.printWord();
		}
		else {
			System.out.println("The word \"" + string2 + "\" does not exist.");
		}
	}
}
