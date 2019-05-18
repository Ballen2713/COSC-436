//Represents the class for the remote control or tablet in our case
public class Options {
	
	public static SystemInterface getSelection() {
		return new OptionsTablet();
		
	}
}
