package lessayer.screen;

import java.util.ArrayList;

public class ManuScreen extends SelectionScreen {
	
	public ManuScreen() {
		// TODO Auto-generated constructor stub
		this.initailizeSelectionList();
		this.printSelection();
		this.readSelection();
	}
	
	protected void initailizeSelectionList() {
		// TODO Auto-generated method stub
		selectionList = new ArrayList<>();
		selectionList.add("Mémoriser des mots");
		selectionList.add("Pratiquer la grammaire");
	}
}
