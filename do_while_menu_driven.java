package assignments;
import java.util.Scanner;
public class do_while_menu_driven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		do 
		{
		System.out.println("Menu");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Exit");
		System.out.println("Enter Your Choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter two numbers:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Addition of Two numbers:"+(a+b));
			break;
			
		case 2:
			System.out.println("Enter two numbers:");
			int a1=sc.nextInt();
			int b1=sc.nextInt();
			System.out.println("Subtraction of Two numbers:"+ (a1-b1));
			break;
			
		case 3:
			System.out.println("Exit");
			break;
		
		default:
		   System.out.println("Invalid choice");		
		}
	}
		while(choice!=3);
	}

}
