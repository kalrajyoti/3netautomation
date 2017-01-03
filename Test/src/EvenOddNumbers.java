
public class EvenOddNumbers {
	
	int calucateEvenOddNumbers;
	
	int peformEvenOddCalculation(int[] EvenOdd)
	{
	
	calucateEvenOddNumbers = EvenOdd[0]%2;
	
	if(calucateEvenOddNumbers ==0)
	{
		System.out.println("the number is even" );
		
	}
	else
	{
		System.out.println("the number is odd ");
	}
	return calucateEvenOddNumbers;

}
}
