
public class Calculator {

	int performCalculation(String typeOfOperation, int[] numbers )
	{
		int resultOfOperation =0;
		switch(typeOfOperation)
		
		{
		   
		    case "Add" :
			 
			ClassAddNumbers addNum = new ClassAddNumbers(numbers);
		    	
		    	resultOfOperation =addNum.performaddtion();
			break;
		    case "Subtract":
		    ClassSubtract sub = new ClassSubtract(numbers);
		    resultOfOperation =sub.performSubtraction(); 
		    break;
		    case "Multiply":
		    ClassMultiply mul = new ClassMultiply(numbers);
		    resultOfOperation =mul.performMultiply();
		    break;
		    case "Divide" :
		    	ClassDivide div = new ClassDivide(numbers);
		    	float resultOfOperation1 =div.performDivision();
		    	break;
		    
		   default:
			   
			   System.out.println("entered value is not valid :");
		}
			
		System.out.println("The operation is called :" +typeOfOperation);
		return resultOfOperation;
		
	}

	
}
