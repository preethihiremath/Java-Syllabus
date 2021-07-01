import java.util.Scanner;

class Temperature
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int temp;
      System.out.println ("Enter any value of temperature: ");

      try{
          temp= input.nextInt();
          if(temp==0)
        {
            throw new ArithmeticException("not valid");  
        }
          else{
          System.out.println ("The temperature is : " + temp);
        }
      }
      catch(ArithmeticException e){
         System.out.println ("Temperature cannot be zero");
      }
   }
}

