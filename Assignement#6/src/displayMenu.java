
//executes the display Menu command
public class displayMenu implements Command {

	SystemInterface menuOptions;
	
	public displayMenu(SystemInterface menuSelection) {
		
		menuOptions = menuSelection;
	}
	
	@Override
	public void execute() {
		
		menuOptions.DisplayMenu();
		
	}

}
