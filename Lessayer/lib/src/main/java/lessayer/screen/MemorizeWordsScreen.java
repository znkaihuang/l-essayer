package lessayer.screen;

import java.util.ArrayList;

public class MemorizeWordsScreen extends SelectionScreen {
	
	public MemorizeWordsScreen() {
		this.initailizeSelectionList();
	}

	protected void initailizeSelectionList() {
		// TODO Auto-generated method stub
		selectionList = new ArrayList<>();
		selectionList.add("Entrez un nouveau mot");
		selectionList.add("Commencer le défi des mots");
	}
}
