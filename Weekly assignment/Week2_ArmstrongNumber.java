package weeklyAssignment;

public class Week2_ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=1534;
		int OriginalValue = value;
		int sum = 0;
		while(value>0)
		{
			int digit = value%10;
			sum = sum + (digit*digit*digit);
			value=value/10;
		}
		if(sum ==OriginalValue)
		{
			System.out.println(OriginalValue + " is an Armstrong number");
		}
		else
		{
			System.out.println(OriginalValue + " is not an Armstrong number");
		}
	}

}
