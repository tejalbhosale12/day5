package Day5;
import java.util.*;
public class FactorsNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println("factors of"+ num+ "are:");
		
		for(int i=1;i<=num;i++) {
			if(num%1==0) {
				System.out.println(i + " ");
			}
		}
	}
}
