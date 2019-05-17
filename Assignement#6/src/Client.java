import java.util.*;
public class Client {

	public static void main(String[] args) {
		Scanner option = new Scanner(System.in);
		
		
		System.out.println("Press one of following commands to be implemented: "
				+ "\n 1. Display Menu " + "\n 2. Submit Order " + "\n 3. Display tab" + "\n 4. Exit");
		boolean exit = false;
		
		do {
			
			int selection = option.nextInt();
			
		switch(selection){
		case 1:
			System.out.println("Display Menu");
			break;
		case 2: 
			System.out.println("Submit Order");
			break;
		case 3: 
			System.out.println("Display tab");
			break;
		case 4: 
			exit = true;
			System.out.println("Exiting.....");
			System.out.println("Sucessfully exited!");
			
			
		}
		} while (!exit);
		
		
		
		
		
		

	}

}
