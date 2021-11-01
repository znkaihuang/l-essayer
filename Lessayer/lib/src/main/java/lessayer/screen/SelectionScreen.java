package lessayer.screen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SelectionScreen {
	ArrayList<String> selectionList;
	
	public SelectionScreen() {
		initailizeSelectionList();
		printSelection();
		readSelection();
	}

	public void printSelection() {
		// TODO Auto-generated method stub
		System.out.println("Qu'est-ce que voulez-vous faire?\n");
		
		for(String selection: this.selectionList) {
			printSelectionListItem(selection, this.selectionList.indexOf(selection));
		}
	}
	
	public int readSelection() {
		// TODO Auto-generated method stub
		String inputSelection = null;
		
		do {
			System.out.println("\nEntrez votre sélection: ");
			
			inputSelection = readInput();
			if(isInvalidSelection(inputSelection)) {
				System.out.println("La sélection n’est pas valide ! Veuillez réessayer!");
			}
			else {
				break;
			}
		} while(true);
		
		return Integer.valueOf(inputSelection);
	}

	private boolean isInvalidSelection(String inputSelection) {
		// TODO Auto-generated method stub
		if(inputSelection.isEmpty() || Integer.valueOf(inputSelection) >= selectionList.size()) {
			return true;
		}
		else {
			return false;
		}
	}

	private String readInput() throws RuntimeException {
		// TODO Auto-generated method stub
		String returnString = null;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			returnString = bufferedReader.readLine();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnString;
	}

	private void printSelectionListItem(String selection, int indexOf) {
		// TODO Auto-generated method stub
		System.out.println(indexOf + ": " + selection);
	}

	private void initailizeSelectionList() {
		// TODO Auto-generated method stub
		selectionList = new ArrayList<>();
		selectionList.add("Mémoriser des mots");
		selectionList.add("Pratiquer la grammaire");
	}
}
