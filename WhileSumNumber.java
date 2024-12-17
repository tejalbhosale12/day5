package Day5;

public class WhileSumNumber {
	public static void main(String[] args) {
		int sum=0;
		int num=1;
		
		while(num<=10) {
			sum+=num;
			num++;
		}
		System.out.println("sum of numbers from 1 to 10 is:" + sum);
	}
}
