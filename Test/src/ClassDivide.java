
public class ClassDivide {
	int division [];

	ClassDivide(int DivisionOfTwoNumbers [])
	{
		division = DivisionOfTwoNumbers;


	}
	float performDivision()
	{
		float result = 1;
		for(int count =0;count<division.length;count++)
		{
			result =result/division[count];
			System.out.println("The Result of Division is " +result);

		}
		return result;

	}
}
