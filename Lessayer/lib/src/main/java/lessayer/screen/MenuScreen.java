package lessayer.screen;

import java.util.ArrayList;

public class MenuScreen extends SelectionScreen {
	
	public MenuScreen() {
		// TODO Auto-generated constructor stub
		this.initailizeSelectionList();
	}
	
	protected void initailizeSelectionList() {
		// TODO Auto-generated method stub
		selectionList = new ArrayList<>();
		selectionList.add("Mémoriser des mots");
		selectionList.add("Pratiquer la grammaire");
	}
}
