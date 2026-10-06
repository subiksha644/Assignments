package weeklyAssignment;

public class Week2_OddEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		int num2 = 1;
		System.out.println("Even numbers: ");
		while(num<=20)
		{
			if(num%2==0)
			{
				System.out.print(num + " ");
			}
			num++;
		}
		System.out.println("\n" +"Odd Numbers:");
		while(num2<=20)
		{
			if(num%2!=0)
			{
				System.out.print(num2 + " ");
			}
			num2++;
		}
	}
}
