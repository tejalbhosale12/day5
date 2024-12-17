package Day5;
import java.util.*;
public class DoWhileFactorialNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to calculate its factorial:");
		int num=sc.nextInt();
		int factorial=1;
		int i=1;
		do {
			factorial*=i;
			i++;
		}while(i<=num);
		System.out.println("the factorial of"+ num + "is:"+ factorial );
	}
}
