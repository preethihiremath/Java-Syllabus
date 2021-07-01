class mythread extends Thread
 {
    String msg;
    mythread(String m)
    { msg=m;}
    
    public void run()
    {
        for(int i=0;i<10;i++)
        {
           System.out.println(msg);
        }
    }
}
 

class Multithread
{
    public static void main(String[] args)
    {
        mythread t1 = new mythread("Child thread");
        t1.start();
        
        for(int i=0;i<10;i++)
        {
             System.out.println("Parent thread");
        }

     }
}