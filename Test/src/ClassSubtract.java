
public class ClassSubtract {
	int subtractionvarible [];
	ClassSubtract(int subtractArray [])
	{
		subtractionvarible = subtractArray;


	}

	int performSubtraction()
	{
		int result =0;
		int count =0;
		while(count<subtractionvarible.length)
		{
			result =result-subtractionvarible[count];
			count++;

		}
		System.out.println("the subtraction is:" +result);
		return result;

	}
}
