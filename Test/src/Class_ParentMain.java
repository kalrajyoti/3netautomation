import java.util.Scanner;


public class Class_ParentMain {
 int printIntegerValue;
 String PrintStringValue;
 
 Class_ParentMain()
 {
	 printIntegerValue = 10;
	 PrintStringValue = "Jyoti";
	 
 }
 Class_ParentMain(int printIntegerValue) 
 {
	 this.printIntegerValue = printIntegerValue;
	 
 }
 Class_ParentMain(Class_ParentMain copyofDefaultconstructor)
 {
	 printIntegerValue = copyofDefaultconstructor.printIntegerValue;
	 PrintStringValue = copyofDefaultconstructor.PrintStringValue;
 }
 void Display()
 {
	 System.out.println("the integer value is " +printIntegerValue);
	 System.out.println("the String value is " +PrintStringValue);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Class_ParentMain callDefaultconstructor = new Class_ParentMain();
		Class_ParentMain callParameterconstructor = new Class_ParentMain(20);
		Class_ParentMain callCopyconstructor = new Class_ParentMain(callParameterconstructor);
		Multioperation multioperationObject = new Multioperation();
		int[] AddNumbersWithLoop = {};
		//multioperationObject.performMultioperation("AddNumberWithLoop",AddNumbersWithLoop);
		//GreatestNumber greatestAmongTwoVarible = new GreatestNumber();
		 
		//Multioperation multioperationvalue  = new Multioperation();
		//int[] test = {2,2,2,2,2,2};
		//multioperationvalue.performMultioperation("Add", test);
		Multioperation subtractvalues  = new Multioperation();
		int[] subtractionArray = {2,4,3,8};
		subtractvalues.performMultioperation("Subtract", subtractionArray);
		
		
		//int[] greatervalue = {6,7};
		//greatestAmongTwoVarible.performGreaterNumberOperation(greatervalue);
		//int[] arrayValues = {90,90};
		//valueOfTwoNumbers.performCalculation("Add",arrayValues);
		//EvenOddNumbers evenOddVarible = new EvenOddNumbers();
		//int[] evenOddValue = {5};
		//evenOddVarible.peformEvenOddCalculation(evenOddValue);
		//int s[] = {10,30};
		//ClassAddNumbers k = new ClassAddNumbers(s);
		//k.performaddtion();
		//int x[] = {30,20};
		//ClassSubtract z =  new ClassSubtract(x);
		//z.performSubtraction();
		//int division [] = {4,2};
		//ClassDivide divide = new ClassDivide(division);
		//divide.performDivision();
		//int [] ArrayOfMultiply = {30,20};
		//ClassMultiply multiplyOfTwoNumber = new ClassMultiply(ArrayOfMultiply);
		//multiplyOfTwoNumber.performMultiply();
		
		//callDefaultconstructor.Display();
		//callParameterconstructor.Display();
		//callCopyconstructor.Display();
		
		
	
		  
	}

}
