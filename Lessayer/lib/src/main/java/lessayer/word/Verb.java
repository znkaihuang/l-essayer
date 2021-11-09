package lessayer.word;

public class Verb extends Word {
	private String infinitive;
	private String pastParticiple;
	private String gerund;
	private String[] indicativePresent;
	private String[] indicativePresentPerfect;
	private String[] indicativeImperfect;
	private String[] indicativeFuture;
	private String[] indicativeConditional;
	private String[] indicativePastHistoric;
	private String[] indicativePluperfect;
	private String[] indicativeFuturePerfect;
	private String[] indicativePastAnterior;
	private String[] indicativeConditionalPerfect;
	private String[] subjunctivePresent;
	private String[] subjunctiveImperfect;
	private String[] subjunctivePresentPerfect;
	private String[] subjunctivePluperfect;
	private String[] imperative;
		
	public Verb(String word) {
		// TODO Auto-generated constructor stub
		super(word);
		this.setType("verb");
	}

	public String getInfinitive() {
		return infinitive;
	}

	public void setInfinitive(String infinitive) {
		this.infinitive = infinitive;
	}

	public String getPastParticiple() {
		return pastParticiple;
	}

	public void setPastParticiple(String pastParticiple) {
		this.pastParticiple = pastParticiple;
	}

	public String getGerund() {
		return gerund;
	}

	public void setGerund(String gerund) {
		this.gerund = gerund;
	}

	public String[] getIndicativePresent() {
		return indicativePresent;
	}

	public void setIndicativePresent(String[] indicativePresent) {
		this.indicativePresent = indicativePresent;
	}

	public String[] getIndicativePresentPerfect() {
		return indicativePresentPerfect;
	}

	public void setIndicativePresentPerfect(String[] indicativePresentPerfect) {
		this.indicativePresentPerfect = indicativePresentPerfect;
	}

	public String[] getIndicativeImperfect() {
		return indicativeImperfect;
	}

	public void setIndicativeImperfect(String[] indicativeImperfect) {
		this.indicativeImperfect = indicativeImperfect;
	}

	public String[] getIndicativeFuture() {
		return indicativeFuture;
	}

	public void setIndicativeFuture(String[] indicativeFuture) {
		this.indicativeFuture = indicativeFuture;
	}

	public String[] getIndicativePastHistoric() {
		return indicativePastHistoric;
	}

	public void setIndicativePastHistoric(String[] indicativePastHistoric) {
		this.indicativePastHistoric = indicativePastHistoric;
	}

	public String[] getIndicativeConditional() {
		return indicativeConditional;
	}

	public void setIndicativeConditional(String[] indicativeConditional) {
		this.indicativeConditional = indicativeConditional;
	}

	public String[] getIndicativePluperfect() {
		return indicativePluperfect;
	}

	public void setIndicativePluperfect(String[] indicativePluperfect) {
		this.indicativePluperfect = indicativePluperfect;
	}

	public String[] getIndicativeFuturePerfect() {
		return indicativeFuturePerfect;
	}

	public void setIndicativeFuturePerfect(String[] indicativeFuturePerfect) {
		this.indicativeFuturePerfect = indicativeFuturePerfect;
	}

	public String[] getIndicativePastAnterior() {
		return indicativePastAnterior;
	}

	public void setIndicativePastAnterior(String[] indicativePastAnterior) {
		this.indicativePastAnterior = indicativePastAnterior;
	}

	public String[] getIndicativeConditionalPerfect() {
		return indicativeConditionalPerfect;
	}

	public void setIndicativeConditionalPerfect(String[] indicativeConditionalPerfect) {
		this.indicativeConditionalPerfect = indicativeConditionalPerfect;
	}

	public String[] getSubjunctivePresent() {
		return subjunctivePresent;
	}

	public void setSubjunctivePresent(String[] subjunctivePresent) {
		this.subjunctivePresent = subjunctivePresent;
	}

	public String[] getSubjunctiveImperfect() {
		return subjunctiveImperfect;
	}

	public void setSubjunctiveImperfect(String[] subjunctiveImperfect) {
		this.subjunctiveImperfect = subjunctiveImperfect;
	}

	public String[] getSubjunctivePresentPerfect() {
		return subjunctivePresentPerfect;
	}

	public void setSubjunctivePresentPerfect(String[] subjunctivePresentPerfect) {
		this.subjunctivePresentPerfect = subjunctivePresentPerfect;
	}

	public String[] getSubjunctivePluperfect() {
		return subjunctivePluperfect;
	}

	public void setSubjunctivePluperfect(String[] subjunctivePluperfect) {
		this.subjunctivePluperfect = subjunctivePluperfect;
	}

	public String[] getImperative() {
		return imperative;
	}

	public void setImperative(String[] imperative) {
		this.imperative = imperative;
	}

}
