import java.util.*;

class MultipleCatch
{
    public static void main(String args[])
    {
    int a,b,z;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter values of a and b");
        try
        {
            a=input.nextInt();
            b=input.nextInt();
            z=a/b;
            System.out.println("Output:"+z);
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }
        catch(Exception i)
        {
             System.out.println(i);
        }
        finally
        {
             System.out.println("Finally block is always excecuted");
        }
    }
}
