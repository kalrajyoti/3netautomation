
public class Multioperation {
	
	void performMultioperation(String typesOfOperation, int value [])
	{
		
		switch(typesOfOperation)
		{
		case "Add" :
		case "Multiply" :
		case "Divide":
		case "Subtract":
				
			Calculator c =new Calculator();
			c.performCalculation(typesOfOperation, value);
			break;
			
		case "EvenOdd":
			EvenOddNumbers evenoddvalues = new EvenOddNumbers();
			evenoddvalues.peformEvenOddCalculation(value);
			break;
			
		case "GreaterNumber" :
			GreatestNumber greaterValue = new GreatestNumber();
			greaterValue.performGreaterNumberOperation(value);
			break;
		case "AddNumberWithLoop":
			AddNumbersWithLoop AddNumbersWithLoopObject = new AddNumbersWithLoop();
			AddNumbersWithLoopObject.performADDOperation();
			break;
		default:
			System.out.println("enter data is not valid ");
		
		}
			}
	

}
