package BlanketSelection;

import java.util.Scanner;


public class FollowUpState {
public void MenuState(Context context) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Is there anything you need ... Select the below options.\n"+
		"1)View Blankets \n" +
		"2)Return to Home Page");
		
		int nextOpt = sc.nextInt();
		
		if( nextOpt==1) {
			ViewBlanketMenuState state= new ViewBlanketMenuState();
			state.MenuState(context);
			
		}
		else {
			MainMenu goHome = new MainMenu();
			goHome.MenuState(context);
		}
	}

}
