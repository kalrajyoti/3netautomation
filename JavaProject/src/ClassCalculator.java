
public class ClassCalculator {

	
	public int performCalculation(String u, int q[]){
		int total=0;
		 
		if(u=="Add")
		{
			ClassAdd w = new ClassAdd(q);
			 total = w.Add();
			System.out.println("Add the values " +total);
			
		}
		else if(u=="substract")
			
		{
			ClassSubtract w = new ClassSubtract(q);
			 total = w.substract();
			System.out.println("substract the value "+total);
			
		}
		else if (u=="Multiply")
		{
			ClassMultiply w = new ClassMultiply(q);
			 total = w.Multiply();
			System.out.println("Multiply the value " +total);
		}
		else if (u=="divide")
		{
			ClassDivide w = new ClassDivide(q);
			 total = w.divide();
			System.out.println("divide the values " +total);
		}
		
		return total;
		
		}
	}
