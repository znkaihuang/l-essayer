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
		String title = "Les règles de grammaire";
		StringBuilder frameBorder = new StringBuilder();
		for(int index = 0; index < title.length() + 2; index++) {
			frameBorder.append('=');
		}
		
		System.out.println(frameBorder);
		System.out.println(" " + title + " ");
		System.out.println(frameBorder);
		
		showRuleList();
	}


	public void startGrammar() {
		// TODO Auto-generated method stub
		
	}

	private void showRuleList() {
		// TODO Auto-generated method stub
		
		// Transform the file names to item names that would be show in the grammar list. 
		for(String ruleFileName : this.ruleFilesSorted) {
			StringBuilder ruleListItem = new StringBuilder();
			String[] fractions = ruleFileName.split("_");
			int fractionCount = 0;
			for(String fraction : fractions) {
				if(fractionCount == 0) {
					ruleListItem.append(fraction + " ");
					ruleListItem.replace(0, 1, String.valueOf(Character.toUpperCase(ruleListItem.charAt(0))));
				}
				else if(fractionCount == fractions.length - 1) {
					if(Integer.valueOf(fraction) != null) {
						ruleListItem.append("(" + fraction + ")");
					}
				}
				else {
					ruleListItem.append(fraction + " ");
				}
				fractionCount++;
			}
			System.out.println("Grammaire " + (ruleFilesSorted.indexOf(ruleFileName) + 1) + ": " + ruleListItem);
		}
	}
}
