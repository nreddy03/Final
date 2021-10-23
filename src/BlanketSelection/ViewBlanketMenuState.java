package BlanketSelection;

public class ViewBlanketMenuState implements State{

	@Override
	public void MenuState(Context context) {
		BlanketFactory blanketFactory = new BlanketFactory();
		blanketFactory.chooseMenu();
		
	}

}
