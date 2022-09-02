import java.util.*;
public class NumberCheck {

	public static void main(String[] args) {
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number : ");
		a=scan.nextInt();
		if(a>0) {
			System.out.println("it is a positive number");
		}
		else if(a<0) {
			System.out.println("it is a negetive number");
		}
	}

}