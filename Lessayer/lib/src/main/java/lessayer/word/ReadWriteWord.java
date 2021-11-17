package lessayer.word;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class ReadWriteWord {
	private static String resourcePath = System.getProperty("user.dir") + "/src/main/resources/";
	private static String indexFilePath = resourcePath + "index";
	private static String dictionaryPath = resourcePath + "dictionary/";
	private static File indexFile = new File(indexFilePath);
	
	public static boolean saveWord(Word word) {
		// TODO Auto-generated method stub
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(indexFile));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(indexFile, true))) {
			// Check the content of indexFile is empty or not.
			if(indexFile.length() == 0) {
				bufferedWriter.append(word.getWord() + '\n');
				saveWordContent(word);
			}
			else {
				if(findWordIndex(word.getWord())) {
					return false;
				}
				else {
					bufferedWriter.append(word.getWord() + '\n');
					saveWordContent(word);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	public static Word loadWord(String string) {
		// TODO Auto-generated method stub
		if(findWordIndex(string)) {
			Word returnWord;
			try(BufferedReader bufferedReader = new BufferedReader(
					new FileReader(dictionaryPath + string))) {
				bufferedReader.readLine(); // word name
				String type = bufferedReader.readLine(); // word type
				returnWord = initWordType(string, type);
				setTypeAttribute(returnWord, type, bufferedReader);
				returnWord.setDefinition(bufferedReader.readLine());
				returnWord.setExampleSentence(bufferedReader.readLine());
				
				return returnWord;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private static Word initWordType(String string, String type) {
		// TODO Auto-generated method stub
		Word returnWord = null;
		if(type.compareTo("noun") == 0) {
			returnWord = new Noun(string);
		}
		else if(type.compareTo("verb") == 0) {
			returnWord = new Verb(string);
		}
		else if(type.compareTo("adjective") == 0) {
			returnWord = new Adjective(string);
		}
		else if(type.compareTo("adverb") == 0) {
			returnWord = new Adverb(string);
		}
		return returnWord;
	}

	private static void setTypeAttribute(Word returnWord, String type, BufferedReader bufferedReader) throws IOException {
		// TODO Auto-generated method stub
		if(type.compareTo("noun") == 0) {
			HashMap<String, String> property = new HashMap<>();
			for(String prop : Noun.getPropertylist()) {
				property.put(prop, bufferedReader.readLine());
			}
			returnWord.setProperty(property);
		}
		else if(type.compareTo("verb") == 0) {
			HashMap<String, String> conjugation = new HashMap<>();
			for(String conj : Verb.getConjugationlist()) {
				conjugation.put(conj, bufferedReader.readLine());
			}
			returnWord.setConjugation(conjugation);
		}
		else if(type.compareTo("adjective") == 0){
			HashMap<String, String> declension = new HashMap<>();
			for(String decl : Adjective.getDeclensionlist()) {
				declension.put(decl, bufferedReader.readLine());
			}
			returnWord.setDeclension(declension);
		}
		else if(type.compareTo("adverb") == 0) {
			
		}
	}

	private static boolean findWordIndex(String string) {
		// TODO Auto-generated method stub
		String wordIndex;
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(indexFile))) {
			while((wordIndex = bufferedReader.readLine()) != null) {
				if(wordIndex.compareTo(string) == 0) {
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	private static void saveWordContent(Word word) {
		// TODO Auto-generated method stub
		File wordContent = new File(dictionaryPath + word.getWord());
		Noun nounWord = (Noun)word;
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(wordContent))) {
			bufferedWriter.append(nounWord.getWord() + '\n');
			bufferedWriter.append(nounWord.getType() + '\n');
			bufferedWriter.append(nounWord.getProperty().get("gender") + '\n');
			bufferedWriter.append(nounWord.getDefinition() + '\n');
			bufferedWriter.append(nounWord.getExampleSentence() + '\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getIndexFilePath() {
		// TODO Auto-generated method stub
		return indexFilePath;
	}
}
