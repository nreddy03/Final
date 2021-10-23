package BlanketSelection;

public class BedBlanketMenuIterator implements Iterator {
	
	BedBlanket[] bedBlanketMenu;
	int count;
	
	public BedBlanketMenuIterator(BedBlanket[] bedBlanketsMenu){
		
		this.bedBlanketMenu=bedBlanketsMenu;
	}

	@Override
	public boolean hasNext() {
		if(count > bedBlanketMenu.length || bedBlanketMenu[count] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Blanket next() {
		BedBlanket bedBlankettype = (BedBlanket) bedBlanketMenu[count];
		count = count +1;
		
		return bedBlankettype;
	}
	

}
