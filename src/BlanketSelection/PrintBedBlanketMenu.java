package BlanketSelection;

public class PrintBedBlanketMenu implements printMenus{
	
	BedBlanket bedBlanket;
	BedBlanketsMenu bedBlanketsMenu;
	
	public PrintBedBlanketMenu(BedBlanketsMenu bedBlanketsMenu) {
		this.bedBlanketsMenu=bedBlanketsMenu;
	}
	
	@Override
	public void printMenu() {
		Iterator iterateBedBlanketMenu= bedBlanketsMenu.createIterator();
		printMenu(iterateBedBlanketMenu);		
	}
	
		public void printMenu(Iterator iterator) {
			System.out.println("--------Bed Blanket Menu--------");
			while(iterator.hasNext()) {
				BedBlanket bedBlanket=(BedBlanket) iterator.next();
				  System.out.print(bedBlanket.getBlanketName() + "\t");
				  System.out.print(bedBlanket.getClothType()+"\t");
				  System.out.println(" $"+bedBlanket.getPrice()+"\n");
			}

		
	}

	
	

}
