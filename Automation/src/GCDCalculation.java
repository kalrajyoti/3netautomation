import java.util.Scanner;


public class GCDCalculation {

	 int number1,number2;
	 int primenumber;
	 int gcd;
	 
	 void performGCD(){
		 Scanner s1 = new Scanner(System.in);
		 System.out.println("Enter Number one :" );
		 number1=  s1.nextInt();
		 
		 System.out.println("Enter Number second :");
		 number2=  s1.nextInt();
		
		
		 for(int i=1;i<=number1 && i<=number2;i++)
		 {
			 if(number1%i ==0 && number2%i ==0)
			 {
				 gcd = i;
			 }
		 }
		 System.out.println(gcd);
	 }
	 
	public static void main(String[] args) {
		GCDCalculation gcd = new GCDCalculation();
		gcd.performGCD();

	}

}
