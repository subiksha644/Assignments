package dailyAssignment;

public class Day31_MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345678;
		int OriginalValue=num;
		int sum=0, value=1;
		while(num>0)
		{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("Sum of Digits: "+sum);
		int finalValue=0;
		for(;sum>9;) 
		{
			while(sum>0)
			{
				int digit1=sum%10;
				finalValue= finalValue+digit1;
				sum=sum/10;
			}
			sum = finalValue;
			finalValue=0;
		}
		System.out.println("Final Digit= "+sum);
		if(sum==value)
		{
			System.out.println(OriginalValue +" is a magic number");
		}
		else
		{
			System.out.println(OriginalValue +" is not a magic number");
		}
	}

}
