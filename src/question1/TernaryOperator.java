package question1;
import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		int a ,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		a = sc.nextInt();
		String varOf = (a %2 == 0)? "even":"odd";
		System.out.println(varOf);
		// TODO Auto-generated method stub

	}

}
