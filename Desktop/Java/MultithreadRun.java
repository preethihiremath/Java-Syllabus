class mthread implements Runnable {
    String msg;
    mthread(String m)
    { msg=m;}
    
    public void run()
    {
        for(int i=0;i<10;i++)
        {
              System.out.println(msg);
        }
    }
}
 
 class MultithreadRun{
    public static void main(String[] args)
    {
        mthread A = new mthread("Child Thread");
        Thread t1 = new Thread(A);
        t1.start();
        
        for(int i=0;i<10;i++)
        {
             System.out.println("Parent Thread");
        }
        
     }
}
