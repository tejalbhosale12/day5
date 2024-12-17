package Day5;
import java.util.*;
public class FactorialNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find its factorial:");
		int number=sc.nextInt();
		long factorial=1;
		if(number<0) {
			System.out.println("factorial is not define for negative numbers.");
		}else {
			int i=1;
			while(i<=number) {
				factorial*=i;
				i++;
			}
			System.out.println("factorial of"+ number+ "is"+ factorial);
		}
		}
	}

