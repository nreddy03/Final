package BlanketSelection;

public class ThrowBlanketIterator implements Iterator {
	
	ThrowBlanket[] throwBlanketMenu;
	int count;
	
	public ThrowBlanketIterator(ThrowBlanket[] throwBlanketMenu){
		
		this.throwBlanketMenu=throwBlanketMenu;
	}

	@Override
	public boolean hasNext() {
		if(count > throwBlanketMenu.length || throwBlanketMenu[count] == null) {
			return false;
		}
		else return true;
	}
	

	@Override
	public Blanket next() {
		ThrowBlanket throwBlankettype = (ThrowBlanket) throwBlanketMenu[count];
		count = count +1;
		
		return throwBlankettype;
	}
	

}
