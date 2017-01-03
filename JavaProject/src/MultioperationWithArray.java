
public class MultioperationWithArray {

	void performMultioperation(String typeOfOperation,int values[])
	{
		switch(typeOfOperation)
		{
		case "OddEven":

			ClassEvenOdd l = new ClassEvenOdd(values);
			l.performPrime();
			
			break;

		case "GreatestNumber":

			ClassGreaterNumber r = new ClassGreaterNumber();
			r.calculateGreater(values);
			
			break;


		case "Add" :
		case "substract" :
		case "Multiply" :
		case "divide" :
			ClassCalculator c = new ClassCalculator();
			c.performCalculation(typeOfOperation, values);
			
			break;

		default :
			System.out.println("enter value is not valid ");


		}
	}
}

