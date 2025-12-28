package assingment02;

import java.util.Scanner;

public class Whilepgm {

	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Enter a PIN :");
		
		int pin = sr.nextInt();
		
		while(pin != 1234) {
			
			System.out.println("Incorrect please retry!");
			
			System.out.println("Enter the PIN :");
			
			pin =sr.nextInt();
		}
		
		System.out.println("access granted!");
	sr.close();		 
	}


	}