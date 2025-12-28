package assingment02;

import java.util.Scanner;

public class PasswordVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Enter your password :");
		
		String pwd = sr.nextLine();
		
		while(pwd.length()<8) {
			System.out.println("password is too short");
			
			System.out.println("Enter your password :");
			
			pwd=sr.nextLine();
		}
		System.out.println("  ");
		
		
        sr.close();
	}

}
