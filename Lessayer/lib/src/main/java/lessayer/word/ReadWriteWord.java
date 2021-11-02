package lessayer.word;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteWord {
	private static File indexFile = new File("/home/kevin/git/l-essayer/Lessayer/lib/src/main/resources/index");
	
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
				String wordIndex;
				while((wordIndex = bufferedReader.readLine()) != null) {
					if(wordIndex.compareTo(word.getWord()) == 0) {
						return false;
					}
				}
				bufferedWriter.append(word.getWord() + '\n');
				saveWordContent(word);
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

	private static void saveWordContent(Noun word) {
		// TODO Auto-generated method stub
		File wordContent = new File("/home/kevin/git/l-essayer/Lessayer/lib/src/main/resources/dictionary/" + word.getWord());
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
