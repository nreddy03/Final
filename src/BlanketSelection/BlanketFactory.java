package BlanketSelection;

import java.util.Scanner;

public class BlanketFactory {
	public void chooseMenu() {
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.println("\n\n-------------SELECT MENU----------------\n\n"+
		"1) BedBlanket Menu\n"+
		"2) Throw Blanket Menu\n"+
		"3) Main Menu\n");
		
		
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
		}else {
			Context context= new Context();
			MainMenu mainMenu= new MainMenu();
			mainMenu.MenuState(context);
			
		}
		Context context = new Context();
		
		FollowUpState followUp = new FollowUpState();
		followUp.MenuState(context);
	}
}
