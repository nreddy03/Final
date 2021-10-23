package BlanketSelection;


public class BedBlanketsMenu {
	
BedBlanket[] bedBlanketsMenu;
	
	public BedBlanketsMenu() {
		bedBlanketsMenu = new BedBlanket[4];
		bedBlanketsMenu[0] = new MadisonPark();
		bedBlanketsMenu[1] = new Nautica();
		bedBlanketsMenu[2] = new Vellux();

	}
	
	public Iterator createIterator() {
		return new BedBlanketMenuIterator(bedBlanketsMenu);
	}

}
