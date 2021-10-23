package BlanketSelection;

public class PrintThrowBlanketMenu implements printMenus {
	ThrowBlanket throwBlanket;
	ThrowBlanketMenu throwBlanketsMenu;
	
	public PrintThrowBlanketMenu(ThrowBlanketMenu throwBlanketsMenu) {
		this.throwBlanketsMenu=throwBlanketsMenu;
	}
	
	public void printMenu() {
		Iterator iterateThrowBlanketMenu= throwBlanketsMenu.createIterator();
		printMenu(iterateThrowBlanketMenu);		
	}
	
		public void printMenu(Iterator iterator) {
			System.out.println("--------Throw Blanket Menu--------");
			while(iterator.hasNext()) {
				ThrowBlanket throwBlanket=(ThrowBlanket) iterator.next();
				  System.out.print(throwBlanket.getBlanketName() + "\t");
				  System.out.print(throwBlanket.getClothType()+"\t");
				  System.out.println(" $"+throwBlanket.getPrice()+"\n");
			}

		
	}


}
