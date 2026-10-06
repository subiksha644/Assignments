package weeklyAssignment;

public class Week2_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int value = num;
		int reverseValue=0;
		while(num>0) {
			int digit = num%10;
			reverseValue = (reverseValue*10)+digit;
			num=num/10;
		}
		if(value==reverseValue)
		{
			System.out.println(value +" is a palindrome number");
		}
		else
		{
			System.out.println(value +" is not a palindrome number");
		}
	}

}
