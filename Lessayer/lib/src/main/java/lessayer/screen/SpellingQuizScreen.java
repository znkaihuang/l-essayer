package lessayer.screen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lessayer.word.ReadWriteWord;

public class SpellingQuizScreen {
	private Map<Integer, String> dictionaryPair;
	private ArrayList<Integer> indexList;
	
	public SpellingQuizScreen() {
		
	}

	public void showInterface() {
		// TODO Auto-generated method stub
		
	}

	public void startQuiz() {
		// TODO Auto-generated method stub
		
	}
	
	public void initaillize() {
		// TODO Auto-generated method stub
		loadWordsFromDictionary();
		shuffleWordIndex();
	}
	
	private void shuffleWordIndex() {
		// TODO Auto-generated method stub
		indexList = new ArrayList<>(dictionaryPair.keySet());
		Collections.shuffle(indexList);
	}

	// Would using MySQL in the future. MySQL offers method to random select data,
	// Just a first thought here.
	private void loadWordsFromDictionary() {
		// TODO Auto-generated method stub
		File indexFile = new File(ReadWriteWord.getIndexFilePath());
		dictionaryPair = new HashMap<>();
		
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(indexFile))) {
			String wordString;
			int count = 0;
			while((wordString = bufferedReader.readLine()) != null) {
				dictionaryPair.put(count++, wordString);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<Integer> getIndexList() {
		// TODO Auto-generated method stub
		return this.indexList;
	}

	public Map<Integer, String> getDictionaryPair() {
		// TODO Auto-generated method stub
		return this.dictionaryPair;
	}
}
