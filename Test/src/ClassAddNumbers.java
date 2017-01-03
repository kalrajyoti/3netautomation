
public class ClassAddNumbers 
{
	int i[];
	
	ClassAddNumbers(int i [])
	{
		
		this.i = i;
				
	}
	int performaddtion()
	{
		int result =0;
		for(int count=0;count<i.length;count++){
			result = result + i[count];
		}
		System.out.println( "the result is" +result);
		return result;
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}