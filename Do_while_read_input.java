package assignments;
import java.util.Scanner;
public class Do_while_read_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    String yn;
	    do {
	    	System.out.println("Do you want to continue?(y/n)");
	    	  yn=sc.next();
	    }
	    while(yn.equals("y"));
	}

}
