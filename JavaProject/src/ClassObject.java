
public class ClassObject {

	int i;
	String s;
	
	ClassObject()
	{
		i=10;
		s="jyoti";
	}
	
	ClassObject(int i,String s)
	{
		this.i = i;
		this.s = s;
		
	}
	ClassObject(ClassObject k)
	{
		
		i = k.i;
		s = k.s;
	}
	void display()
	{
		System.out.println("The value of i is " +i);
		System.out.println("The value of s is "  +s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassObject c1 = new ClassObject();
		ClassObject c2 = new ClassObject(20,"deepu");
		ClassObject c3 = new ClassObject(c2);	
		//ClassAdd a = new ClassAdd(10,20);
		//ClassMultiply m = new ClassMultiply(20,30);
		// ClassSubtract s = new  ClassSubtract(100,90);
		// ClassDivide d = new ClassDivide(40,20);
		 ClassCalculator g = new ClassCalculator();
		 MultioperationWithArray h = new MultioperationWithArray();
		 int values[] = {2,9};
		 int OddEven[]={3};
		 int GreaterNumber[]={2,4};
		 h.performMultioperation("Add",values);
		 h.performMultioperation("OddEven",OddEven);
		 h.performMultioperation("GreatestNumber",GreaterNumber);
		//int addition = g.performCalculation("Add",10,20);//
		//ClassEvenOdd p = new ClassEvenOdd(9);
		//ClassGreaterNumber b = new ClassGreaterNumber();
		//b.calculateGreater(0, 9);
		
		//c1.display();
		//c2.display();
		//c3.display();
		//int finalvalue =a.Add();
		//int finalresult = m.Multiply();
		//int value = s.substract();
		//int divide = d.divide();
		
		//System.out.println("the final value is " +finalvalue);
		//System.out.println("the final multiplation value is " +finalresult);
		//System.out.println("the final subtraction value is " +value);
		//System.out.println("the final division value is " +divide);
		
		
		
		

	}

}
