package Day5;
import java.util.*;
public class ForFactorialNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int factorial=1 ;
		int i=1;
		for(i=1;i<=num;i++) {
			 factorial*= i;
		}

		System.out.println("factorial of" +num+ "is:" + factorial);
	}
}
