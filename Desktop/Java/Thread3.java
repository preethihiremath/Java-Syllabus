class multipleOfTen extends Thread
 {
     String msg;
    multipleOfTen(String m)
    { msg=m;}
    public void run()
    {
        System.out.println("");
        for(int i=10;i<=100;i=i+10)
        {
        System.out.print(msg+i+"\n");
        }
}
}
 
class Even extends Thread
 {

    String msg;
    Even(String m)
    { msg=m;}
    
    public void run()
    {
       
        for(int i=2;i<=100;i=i+2)
        {
            System.out.print(msg+i+"\n");
        }
}
}
 
class MultipleOfFive extends Thread
 {
    String msg;
    MultipleOfFive(String m)
    { msg=m;}
    
    
    public void run()
    {
        
        for(int i=5;i<=100;i++)
        {
           
        if(i%5==0){
            System.out.print(msg+i+"\n");
        }
        }
}
}
 

public class Thread3 {

    public static void main(String[] args){
      
        multipleOfTen m10 = new multipleOfTen("Multiple of 10: ");
        Even e =new Even("Even: ");
        MultipleOfFive m5 = new MultipleOfFive("Multiple of 5: ");
       
        m10.start();
        e.start(); 
        m5.start();
        System.out.println("Thread One is alive: "   + m10.isAlive());  
        System.out.println("Thread Two is alive: " + e.isAlive());     
        System.out.println("Thread Three is alive: " + m5.isAlive()); 
         
        
        try {      
            System.out.println("Waiting for threads to finish."); 
                m10.join();       
                e.join();       
                m5.join();     
           } 
           catch (InterruptedException exp)
            {  
                System.out.println("Main thread Interrupted"); 
            } 
            System.out.println("Main thread");
            System.out.println("Thread One is alive: "   + m10.isAlive());  
            System.out.println("Thread Two is alive: " + e.isAlive());     
            System.out.println("Thread Three is alive: " + m5.isAlive()); 
        
    }
   
}
