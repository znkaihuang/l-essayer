package lessayer.word;

public class Verb extends Word {
	// FS is the abbreviation for "first singular".
	// SS is the abbreviation for "second singular".
	// TS is the abbreviation for "third singular".
	// FP is the abbreviation for "first plural".
	// SP is the abbreviation for "second plural".
	// TP is the abbreviation for "third plural".
	final static private String[] conjugationList = {"infinitive", "pastParticiple", "gerund",
													 "indicativePresentFS","indicativePresentSS","indicativePresentTS",
													 "indicativePresentFP","indicativePresentSP","indicativePresentTP",
													 "indicativePresentPerfectFS","indicativePresentPerfectSS","indicativePresentPerfectTS",
													 "indicativePresentPerfectFP","indicativePresentPerfectSP","indicativePresentPerfectTP",
													 "indicativeImperfectFS","indicativeImperfectSS","indicativeImperfectTS",
													 "indicativeImperfectFP","indicativeImperfectSP","indicativeImperfectTP",
													 "indicativeFutureFS","indicativeFutureSS","indicativeFutureTS",
													 "indicativeFutureFP","indicativeFutureSP","indicativeFutureTP",
													 "indicativeConditionalFS","indicativeConditionalSS","indicativeConditionalTS",
													 "indicativeConditionalFP","indicativeConditionalSP","indicativeConditionalTP",
													 "indicativePastHistoricFS","indicativePastHistoricSS","indicativePastHistoricTS",
													 "indicativePastHistoricFP","indicativePastHistoricSP","indicativePastHistoricTP",
													 "indicativePluperfectFS","indicativePluperfectSS","indicativePluperfectTS",
													 "indicativePluperfectFP","indicativePluperfectSP","indicativePluperfectTP",
													 "indicativeFuturePerfectFS","indicativeFuturePerfectSS","indicativeFuturePerfectTS",
													 "indicativeFuturePerfectFP","indicativeFuturePerfectSP","indicativeFuturePerfectTP",
													 "indicativePastAnteriorFS","indicativePastAnteriorSS","indicativePastAnteriorTS",
													 "indicativePastAnteriorFP","indicativePastAnteriorSP","indicativePastAnteriorTP",
													 "indicativeConditionalPerfectFS","indicativeConditionalPerfectSS","indicativeConditionalPerfectTS",
													 "indicativeConditionalPerfectFP","indicativeConditionalPerfectSP","indicativeConditionalPerfectTP",
													 "subjunctivePresentFS","subjunctivePresentSS","subjunctivePresentTS",
													 "subjunctivePresentFP","subjunctivePresentSP","subjunctivePresentTP",
													 "subjunctiveImperfectFS","subjunctiveImperfectSS","subjunctiveImperfectTS",
													 "subjunctiveImperfectFP","subjunctiveImperfectSP","subjunctiveImperfectTP",
													 "subjunctivePresentPerfectFS","subjunctivePresentPerfectSS","subjunctivePresentPerfectTS",
													 "subjunctivePresentPerfectFP","subjunctivePresentPerfectSP","subjunctivePresentPerfectTP",
													 "subjunctivePluperfectFS","subjunctivePluperfectSS","subjunctivePluperfectTS",
													 "subjunctivePluperfectFP","subjunctivePluperfectSP","subjunctivePluperfectTP",
													 "imperativeSS","imperativeFP","imperativeSP"};
		
	public Verb(String word) {
		// TODO Auto-generated constructor stub
		super(word);
		this.setType("verb");
	}
	
	@Override
	public void printWord() {
		System.out.println(this.getWord() + " v.");
		System.out.println("Print the conjugation table.");
		for(String conj : Verb.conjugationList) {
			System.out.println(conj + ": " + this.getConjugation().get(conj));
		}
		System.out.println("Définition:\n" + this.getDefinition());
		System.out.println("Exemple:\n" + this.getExampleSentence());
	}
	
	public static String[] getConjugationlist() {
		return conjugationList;
	}
}
