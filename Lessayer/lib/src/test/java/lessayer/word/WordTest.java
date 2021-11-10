package lessayer.word;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class WordTest {

	@Test
	void wordTest() {
		String definition = "dog";
		String exampleSentence = "Ce qu'il y a de meilleur dans l'homme, c'est le chien.";
		
		Word word = new Word("chien");
		word.setDefinition("dog");
		word.setExampleSentence("Ce qu'il y a de meilleur dans l'homme, c'est le chien.");
		
		word.printWord();
		assertEquals(definition, word.getDefinition());
		assertEquals(exampleSentence, word.getExampleSentence());
	}
	
	@Test
	void nounTest() {
		String definition = "dog";
		String exampleSentence = "Ce qu'il y a de meilleur dans l'homme, c'est le chien.";
		HashMap<String, String> property = new HashMap<>();
		property.put("gender", "masculin");
		
		Noun word = new Noun("chien");
		word.setDefinition("dog");
		word.setExampleSentence("Ce qu'il y a de meilleur dans l'homme, c'est le chien.");
		word.setProperty(property);
		
		word.printWord();
		assertEquals("noun", word.getType());
		assertEquals(definition, word.getDefinition());
		assertEquals(exampleSentence, word.getExampleSentence());
		assertEquals(property, word.getProperty());
	}
	
	@Test
	void verbTest() {
		String definition = "to have";
		String exampleSentence = "Il a beaucoup d’amis.";
		HashMap<String, String> conjugation = new HashMap<>();
		conjugation.put("infinitive", "avoir");
		conjugation.put("pastParticiple", "eu");
		conjugation.put("gerund", "ayant");
		conjugation.put("indicativePresentFS", "j'ai");
		conjugation.put("indicativePresentSS", "tu as");
		conjugation.put("indicativePresentTS", "il/elle a");
		conjugation.put("indicativePresentFP", "nous avons");
		conjugation.put("indicativePresentSP", "vous avez");
		conjugation.put("indicativePresentTP", "ils/elles ont");
		conjugation.put("indicativePresentPerfectFS", "j'ai eu");
		conjugation.put("indicativePresentPerfectSS", "tu as eu");
		conjugation.put("indicativePresentPerfectTS", "il/elle a eu");
		conjugation.put("indicativePresentPerfectFP", "nous avons eu");
		conjugation.put("indicativePresentPerfectSP", "vous avez eu");
		conjugation.put("indicativePresentPerfectTP", "ils/elles ont eu");
		conjugation.put("indicativeImperfectFS", "j'avais");
		conjugation.put("indicativeImperfectSS", "tu avais");
		conjugation.put("indicativeImperfectTS", "il/elle avait");
		conjugation.put("indicativeImperfectFP", "nous avions");
		conjugation.put("indicativeImperfectSP", "vous aviez");
		conjugation.put("indicativeImperfectTP", "ils/elles avaient");
		conjugation.put("indicativeFutureFS", "j'aurai");
		conjugation.put("indicativeFutureSS", "tu auras");
		conjugation.put("indicativeFutureTS", "il/elle aura");
		conjugation.put("indicativeFutureFP", "nous aurons");
		conjugation.put("indicativeFutureSP", "vous aurez");
		conjugation.put("indicativeFutureTP", "ils/elles auront");
		conjugation.put("indicativeConditionalFS", "j'aurais");
		conjugation.put("indicativeConditionalSS", "tu aurais");
		conjugation.put("indicativeConditionalTS", "il/elle aurait");
		conjugation.put("indicativeConditionalFP", "nous aurions");
		conjugation.put("indicativeConditionalSP", "vous auriez");
		conjugation.put("indicativeConditionalTP", "ils/elles auraient");
		conjugation.put("indicativePastHistoricFS", "j'eus");
		conjugation.put("indicativePastHistoricSS", "tu eus");
		conjugation.put("indicativePastHistoricTS", "il/elle eut");
		conjugation.put("indicativePastHistoricFP", "nous eûmes");
		conjugation.put("indicativePastHistoricSP", "vous eûtes");
		conjugation.put("indicativePastHistoricTP", "ils/elles eurent");
		conjugation.put("indicativePluperfectFS", "j'avais eu");
		conjugation.put("indicativePluperfectSS", "tu avais eu");
		conjugation.put("indicativePluperfectTS", "il/elle avait eu");
		conjugation.put("indicativePluperfectFP", "nous avions eu");
		conjugation.put("indicativePluperfectSP", "vous aviez eu");
		conjugation.put("indicativePluperfectTP", "ils/elles avaient eu");
		conjugation.put("indicativeFuturePerfectFS", "j'aurai eu");
		conjugation.put("indicativeFuturePerfectSS", "tu auras eu");
		conjugation.put("indicativeFuturePerfectTS", "il/elle aura eu");
		conjugation.put("indicativeFuturePerfectFP", "nous aurons eu");
		conjugation.put("indicativeFuturePerfectSP", "vous aurez eu");
		conjugation.put("indicativeFuturePerfectTP", "ils/elles auront eu");
		conjugation.put("indicativePastAnteriorFS", "j'eus eu");
		conjugation.put("indicativePastAnteriorSS", "tu eus eu");
		conjugation.put("indicativePastAnteriorTS", "il/elle eut eu");
		conjugation.put("indicativePastAnteriorFP", "nous eûmes eu");
		conjugation.put("indicativePastAnteriorSP", "vous eûtes eu");
		conjugation.put("indicativePastAnteriorTP", "ils/elles eurent eu");
		conjugation.put("indicativeConditionalPerfectFS", "j'aurais eu");
		conjugation.put("indicativeConditionalPerfectSS", "tu aurais eu");
		conjugation.put("indicativeConditionalPerfectTS", "il/elle aurait eu");
		conjugation.put("indicativeConditionalPerfectFP", "nous aurions eu");
		conjugation.put("indicativeConditionalPerfectSP", "vous auriez eu");
		conjugation.put("indicativeConditionalPerfectTP", "ils/elles auraient eu");
		conjugation.put("subjunctivePresentFS", "j'aie");
		conjugation.put("subjunctivePresentSS", "tu aies");
		conjugation.put("subjunctivePresentTS", "il/elle ait");
		conjugation.put("subjunctivePresentFP", "nous ayons");
		conjugation.put("subjunctivePresentSP", "vous ayez");
		conjugation.put("subjunctivePresentTP", "ils/elles aient");
		conjugation.put("subjunctiveImperfectFS", "j'eusse");
		conjugation.put("subjunctiveImperfectSS", "tu eusses");
		conjugation.put("subjunctiveImperfectTS", "il/elle eût");
		conjugation.put("subjunctiveImperfectFP", "nous eussions");
		conjugation.put("subjunctiveImperfectSP", "vous eussiez");
		conjugation.put("subjunctiveImperfectTP", "ils/elles eussent");
		conjugation.put("subjunctivePresentPerfectFS", "j'aie eu");
		conjugation.put("subjunctivePresentPerfectSS", "tu aies eu");
		conjugation.put("subjunctivePresentPerfectTS", "il/elle ait eu");
		conjugation.put("subjunctivePresentPerfectFP", "nous ayons eu");
		conjugation.put("subjunctivePresentPerfectSP", "vous ayez eu");
		conjugation.put("subjunctivePresentPerfectTP", "ils/elles aient eu");
		conjugation.put("subjunctivePluperfectFS", "j'eusse eu");
		conjugation.put("subjunctivePluperfectSS", "tu eusses eu");
		conjugation.put("subjunctivePluperfectTS", "il/elle eût eu");
		conjugation.put("subjunctivePluperfectFP", "nous eussions eu");
		conjugation.put("subjunctivePluperfectSP", "vous eussiez eu");
		conjugation.put("subjunctivePluperfectTP", "ils/elles eussent eu");
		conjugation.put("imperativeSS", "aie");
		conjugation.put("imperativeFP", "ayons");
		conjugation.put("imperativeSP", "ayez");
		
		Verb word = new Verb("avoir");
		word.setDefinition("to have");
		word.setExampleSentence("Il a beaucoup d’amis.");
		word.setConjugation(conjugation);
		
		word.printWord();
		assertEquals("noun", word.getType());
		assertEquals(definition, word.getDefinition());
		assertEquals(exampleSentence, word.getExampleSentence());
		assertEquals(conjugation, word.getConjugation());
	}
	
	@Test
	void saveWordTest() {
		String definition1 = "dog";
		String exampleSentence1 = "Ce qu'il y a de meilleur dans l'homme, c'est le chien.";
		Noun word1 = new Noun("chien");
		HashMap<String, String> property1 = new HashMap<>();
		property1.put("gender", "masculin");
		word1.setProperty(property1);
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
		HashMap<String, String> property2 = new HashMap<>();
		property2.put("gender", "masculin");
		word1.setProperty(property2);
		Noun word2 = new Noun("loup");
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
