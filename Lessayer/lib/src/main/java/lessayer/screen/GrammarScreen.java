/**
 * 
 */
package lessayer.screen;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author kevin
 *
 */
public class GrammarScreen {
	private String ruleFilesDirectoryPath = "/home/kevin/git/l-essayer/Lessayer/lib/src/main/resources/grammar_rules";
	private  ArrayList<String> ruleFilesSorted;

	public GrammarScreen() {
		// TODO Auto-generated constructor stub
	}

	public void initialize() {
		// TODO Auto-generated method stub
		Set<String> ruleFilesSet = Stream.of(new File(ruleFilesDirectoryPath).listFiles())
			      .filter(file -> !file.isDirectory())
			      .map(File::getName)
			      .collect(Collectors.toSet());
		this.ruleFilesSorted = new ArrayList<>(ruleFilesSet);
		Collections.sort(ruleFilesSorted);
	}
	
	public ArrayList<String> getRuleFilesSorted() {
		return ruleFilesSorted;
	}
	
	public void showInterface() {
		// TODO Auto-generated method stub
		
	}

	public void startGrammar() {
		// TODO Auto-generated method stub
		
	}


}
