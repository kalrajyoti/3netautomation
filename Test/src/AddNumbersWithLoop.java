import java.util.Scanner;


public class AddNumbersWithLoop {
	
	
	int performADDOperation()
	{
		int num;
	    Scanner scan = new Scanner(System.in);
		
	    System.out.print("Enter a Number : ");
	    num = scan.nextInt();
		
	    
		 int sum =0;
		for( int i=1;i<=num;i++)
		{
			
			
				sum = sum+i;
			
		}
		System.out.println("the value of n numbers:" +sum);
		return sum;
	}

	
	
}
	

