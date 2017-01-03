
public class ClassMultiply {
	
	int[] multiplyArray;
	
	ClassMultiply(int multiplyOfThreeNumbers [])
	{
		multiplyArray = multiplyOfThreeNumbers;
		
	}
	int performMultiply()
	{
		int finalresult = 1;
		for(int count =0;count<multiplyArray.length;count++)
		{
		finalresult = multiplyArray[count]*finalresult;
		System.out.println("The Multiplication of two numbers is : " +finalresult );
		}
		return finalresult;
		
		
	}

}
