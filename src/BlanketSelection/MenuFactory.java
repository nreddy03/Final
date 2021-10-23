package BlanketSelection;

import java.util.Scanner;

public class MenuFactory {
	public void chooseMenu() {
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.println("\n\n-------------SELECT MENU----------------\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) BedBlanket Menu\n"+
		"2) Throw Blanket Menu\n");
		
		
		int menuChoice = usrInpt.nextInt();
		
		
		if(menuChoice ==1) {
			BedBlanketsMenu bedBlanketsMenu = new BedBlanketsMenu();
			PrintBedBlanketMenu printBedBlanketMenu = new PrintBedBlanketMenu(bedBlanketsMenu);
			
			printBedBlanketMenu.printMenu();
		}
		if(menuChoice==2) {
			ThrowBlanketMenu throwBlanket =new ThrowBlanketMenu();
			PrintThrowBlanketMenu printThrowBlanketMenu= new PrintThrowBlanketMenu(throwBlanket);
			printThrowBlanketMenu.printMenu();
		}
}
}