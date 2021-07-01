 class CommandlineException 
{
    public void doDivide(int a, int b)
    {
         try{
             float result = a/b;
             System.out.println("Division result of "+ a +"/"+b +"= " +result);
         }catch(ArithmeticException e){
             System.out.println("Error!! arthmetic exception cannot divide by zero");
         }
     }
}
            
class TestCommandlineException {
    public static void main(String[] args)
    {
		for(int i=0;i<args.length;i++)
             System.out.println(args[i]);
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);		
		new CommandlineException ().doDivide(a,b);		
	}
}


