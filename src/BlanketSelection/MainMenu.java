package BlanketSelection;

import java.util.Scanner;

public class MainMenu implements State{

	public void MenuState(Context context) {
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.print("-------- Blanket Selection Menu Options--------\n" + 
		"1) Menu Selections \n" + 
		
		"2) View All Menus\n" +" 3) Packing \n"+"4) Lobby");
		
		
		System.out.print("");		
		// Implementation of State pattern classes
		int select=usrInpt.nextInt();
		
		if(select==1) {
			BlanketFactory viewMenus= new BlanketFactory();
			viewMenus.chooseMenu();
		}	
		else if(select==2) {
		ViewBlanketMenuState viewAll=new ViewBlanketMenuState();
		viewAll.MenuState(context);
		}
		else if(select==3){
			PackingState packingState= new PackingState();
			packingState.MenuState(context);
		}else {
		System.exit(0);
	}
	context.setState(this);
}	
}
	
