
public class ClassGreaterNumber {

	
	
	int calculateGreater(int j[] )
	{
		int value =0;
		if(j[0]>j[1])
		{
			value = j[0];
			
		}
		else if(j[1]>j[0])
		{
			value = j[1];
				}
		System.out.println( " The  greater no is :" +value);

	return value;
	}
}

