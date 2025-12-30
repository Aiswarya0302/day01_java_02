package assignments;
import java.util.Scanner;
public class Do_while_phnum_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String phn;
		do
		{
			System.out.println("Enter Your Phone Number:");
			phn=sc.next();
		}
		while(phn.length()!=10);
	}

}
