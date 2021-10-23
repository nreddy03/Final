package BlanketSelection;


public class PackingState implements State{

	@Override
	public void MenuState(Context context) {
		System.out.println("Your selected Blanket sent for packing.");
		
		FollowUpState followUp = new FollowUpState();
		followUp.MenuState(context);
		context.setState(this);
	}

}
