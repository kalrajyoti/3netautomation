
public class ClassEvenOdd {
	int l[];
	

	ClassEvenOdd(int j[])
	{
		l = j;
		
		
				
	}
	int performPrime()
	{
		
		int result =  l[0]%2;
		
		if(result==0)
		{
			 
			System.out.println("its even Number");
		}
		else if(!(result==0))
		{
			System.out.println("its odd number ");
		}
		return result;
		
	}
}
