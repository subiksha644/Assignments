package weeklyAssignment;

public class Week2_CountTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234567;
		int count = 0;
		while(num!=0)
		{
			int last= num%10;
			num=num/10;
			count++;
		}
		System.out.println("Number of Digits = "+count);
	}

}
