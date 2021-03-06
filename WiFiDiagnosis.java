import java.util.Scanner;

public class WiFiDiagnosis {

	public static void main(String[] args) {
		
		String choice; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("If you have a problem with internet connectivity, this diagnosis might work.");
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		choice = scan.nextLine();
		
		if (choice.equals("yes")) {
			System.out.println("Congrats");
		}
		else {
			System.out.println("Second step: reboot your router");
			System.out.println("Are you able to connect with the internet? (yes or no)");
			choice = scan.nextLine();
			
			if (choice.equals("yes")) {
				System.out.println("Congrats");
			}
			else {
				System.out.println("Third step: make sure the cables connecting the router are firmly plugged in and power is getting to the router");
				System.out.println("Are you able to connect with the internet? (yes or no)");
				choice = scan.nextLine();
				
				if (choice.equals("yes")) {
					System.out.println("Congrats");
				}
				else {
					System.out.println("Fourth step: move the computer closer to the router and try to connect");
					System.out.println("Are you able to connect with the internet? (yes or no)");
					choice = scan.nextLine();
					
					if (choice.equals("yes")) {
						System.out.println("Congrats");
					}
					else {
						System.out.println("Fifth step: contact your ISP");
						System.out.println("Make sure your ISP is hooked to your router");
					}
				}
			}
		}	
	}
}
