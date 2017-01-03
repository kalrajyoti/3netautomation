
public class GreatestNumber {


	int performGreaterNumberOperation(int[] numberOfValues)
	{
		int value =0;

		for(int count = 0;count<numberOfValues.length;count++)
		{
			if(numberOfValues[count]>value)

			{
				value = numberOfValues[count];

			}

			
		}
		System.out.println("This value is greater :" +value);
		return value;
		
	}

}

