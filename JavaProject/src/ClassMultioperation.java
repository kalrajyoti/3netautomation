
public class ClassMultioperation {

	int performMultioperation(String f,int j,int k)
	{
		int finalresultvalue =0;
		switch(f)
		{
		case "OddEven":

			//ClassEvenOdd l = new ClassEvenOdd(j);
			//finalresultvalue =l.performPrime();
			
			break;

		case "GreatestNumber":

			//ClassGreaterNumber r = new ClassGreaterNumber();
			//finalresultvalue = r.calculateGreater(j, k);
			
			break;


		case "Add" :
		case "substract" :
		case "Multiply" :
		case "divide" :
			ClassCalculator c = new ClassCalculator();
			//finalresultvalue = c.performCalculation(f, j, k);
			
			break;

		default :
			System.out.println("enter value is not valid ");


		}
		return finalresultvalue;
	}
}

