package Day5;

public class SumOddNumber {
	public static void main(String[] args) {
		int number=1;
		int sum=0;
		while(number<=10) {
			sum+=number;
			number+=2;
			System.out.println("sum of odd number"+sum);
		}
	}
}
