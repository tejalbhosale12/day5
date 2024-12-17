package Day5;

public class EvenOddNumber {
	public static void main(String[] args) {
		int evenSum=0;
		int oddSum=0;
		
		for(int num=1;num<=30;num++) {
			if(num%2==0) {
				evenSum+=num;
			}else {
				oddSum+=num;
			}
		}
		
		System.out.println("Sum of even numbers between 1 and 30:" + evenSum);
		System.out.println("Sum of odd numbers between 1 and 30:" + oddSum);
	}
}
