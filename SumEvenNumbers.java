package Day5;

public class SumEvenNumbers {
	public static void main(String[] args) {
		int number=2;
		int sum=0;
		while(number<=10) {
			sum+=number;
			number+=2;
			System.out.println("sum of even number 1to 10:"+sum);
	}
}
}