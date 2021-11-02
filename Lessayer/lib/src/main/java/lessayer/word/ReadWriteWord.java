package lessayer.word;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteWord {
	private static String resourcePath = "/home/kevin/git/l-essayer/Lessayer/lib/src/main/resources/";
	private static String indexFilePath = resourcePath + "index";
	private static String dictionaryPath = resourcePath + "dictionary/";
	private static File indexFile = new File(indexFilePath);
	
	public static boolean saveWord(Noun word) {
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
	
	public static Noun loadWord(String string) {
		// TODO Auto-generated method stub
		if(findWordIndex(string)) {
			Noun returnWord = new Noun(string);
			try(BufferedReader bufferedReader = new BufferedReader(
					new FileReader(dictionaryPath + string))) {
				bufferedReader.readLine(); // word name
				bufferedReader.readLine(); // word type
				returnWord.setGender(bufferedReader.readLine());
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
	
	private static void saveWordContent(Noun word) {
		// TODO Auto-generated method stub
		File wordContent = new File(dictionaryPath + word.getWord());
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(wordContent))) {
			bufferedWriter.append(word.getWord() + '\n');
			bufferedWriter.append(word.getType() + '\n');
			bufferedWriter.append(word.getGender() + '\n');
			bufferedWriter.append(word.getDefinition() + '\n');
			bufferedWriter.append(word.getExampleSentence() + '\n');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
