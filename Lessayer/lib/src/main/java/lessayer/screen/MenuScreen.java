package lessayer.screen;

import java.util.ArrayList;

<<<<<<< HEAD
public class MenuScreen extends SelectionScreen {
	
	public MenuScreen() {
		// TODO Auto-generated constructor stub
		this.initailizeSelectionList();
=======
public class ManuScreen extends SelectionScreen {
	
	public ManuScreen() {
		// TODO Auto-generated constructor stub
		this.initailizeSelectionList();
		this.printSelection();
		this.readSelection();
>>>>>>> branch 'main' of git@github.com:znkaihuang/l-essayer.git
	}
	
	protected void initailizeSelectionList() {
		// TODO Auto-generated method stub
		selectionList = new ArrayList<>();
		selectionList.add("Mémoriser des mots");
		selectionList.add("Pratiquer la grammaire");
	}
}
