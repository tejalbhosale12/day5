package Day5;

public class DoSumOddNo {
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		do {
			sum+=num;
			num+=2;
		}while(num<=10);
		System.out.println("the sum of even numbers from 1 to 10 is:"+sum);
	}

	}

