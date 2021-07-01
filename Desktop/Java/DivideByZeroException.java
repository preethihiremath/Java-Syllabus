import java.util.Scanner;
public class DivideByZeroException {
   
	public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		System.out.print("enter first number: ");
		int num1 = input.nextInt();
		System.out.print("enter second number: ");
		int num2= input.nextInt();		
		new DivideByZeroException().doDivide(num1, num2);		
	}
   
	public void doDivide(int a, int b){
		try
       {
			float result = a/b;
			System.out.println("result:  " +result);
		}
      catch(ArithmeticException e)
      {
			System.out.println("Error! Arithmetic exception ");
		}
	} 
}
