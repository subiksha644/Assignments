package dailyAssignment;

public class Day31_SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1124;
		int OriginalValue=num;
		int value=num;
		int sum=0,product=1;
		System.out.println("Enter the number: "+OriginalValue);
		while(num>0)
		{
			int digit = num%10;
			sum = sum+digit;
			num=num/10;
		}
		System.out.println("Sum of Digits= "+ sum);
		while(value>0)
		{
			int digit1= value%10;
			product = product*digit1;
			value=value/10;
		}
		System.out.println("Product of number= "+product);
		if(sum==product)
		{
			System.out.println(OriginalValue+ " is a Spy number");
		}
		else
		{
			System.out.println(OriginalValue+ " is not a Spy number");
		}
	}

}
