package lessayer.screen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import lessayer.word.*;

public class EnterWordScreen {
	private ArrayList<String> typeList;
	
	public EnterWordScreen(){

	}

	public void continueOrQuit() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Continuer à entrer un mot ou quitter? ");
			System.out.println("Entrez 'y' pour continuer et entrez 'n' pour quitter. (y/n)");
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			try {
				if(bufferedReader.readLine().compareTo("y") == 0) {
					Word word = readWord();
					printWord(word);
					ReadWriteWord.saveWord(word);
				}
				else {
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void printWord(Word word) {
		// TODO Auto-generated method stub
		word.printWord();
		
	}

	public Word readWord() {
		// TODO Auto-generated method stub
		Word word = null;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Entrez le mot: ");
			String wordString = bufferedReader.readLine();
			
			System.out.println("Entrez le type du mot:");
			showTypeList();
			word = setWordType(wordString, Integer.valueOf(bufferedReader.readLine()), bufferedReader);
			
			System.out.println("Entrez la définition du mot:");
			word.setDefinition(bufferedReader.readLine());
			
			System.out.println("Entrez un exemple du mot:");
			word.setExampleSentence(bufferedReader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return word;
	}

	private Word setWordType(String wordString, int type, BufferedReader bufferedReader) throws IOException {
		// TODO Auto-generated method stub
		Word word = null;
		
		switch(type) {
			case 0: // Noun
				Noun nounWord = new Noun(wordString);
				System.out.println("Entrez le genre du mot: (masculin ou féminin)");
				HashMap<String, String> property = new HashMap<>();
				property.put("gender", bufferedReader.readLine());
				nounWord.setProperty(property);
				word = nounWord;
				break;
			default:
				throw new RuntimeException("Type non valide");
		}
		return word;
	}

	private void showTypeList() {
		// TODO Auto-generated method stub
		initializeTypeList();
		
		for(String type : this.typeList) {
			System.out.println(typeList.indexOf(type) + ": " + type);
		}
	}

	private void initializeTypeList() {
		// TODO Auto-generated method stub
		typeList = new ArrayList<>();
		this.typeList.add("noun");
	}
	

}
