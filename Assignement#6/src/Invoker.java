public class Invoker {
	
	//Command object used for triggering the command to execute
	Command theCommand;
	
	public Invoker(Command newCommand){
		theCommand = newCommand;
	}
	
	public void press() {
		theCommand.execute();
	}
	
}
