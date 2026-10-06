package weeklyAssignment;

public class Week2_ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =12345;
		int sum =0;
		for(;num>0;)
		{
			int last=num%10;
			sum = last;
			num=num/10;
			System.out.print(sum);
			
		}
	}

}
