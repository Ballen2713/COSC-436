/**
 * Class will serve as the item for the 
 * commander pattern in our case. The user will use a 
 * tablet to select one of the three options or commands
 * to execute
 * 
 **/
public class OptionsTablet implements SystemInterface {

	@Override
	public void DisplayMenu() {
		System.out.println("Current Entrees on the menu");
		
	}

	@Override
	public void SubmitOrder() {
		System.out.println("User will be allowed to order from the menu");
		
	}

	@Override
	public void DisplayTab() {
		System.out.println("Generates list of food that was ordered");
		
	}

}
