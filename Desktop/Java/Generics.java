import java.util.ArrayList;
class Stack<T>
{
  ArrayList<T> a;
   int top;
   
   Stack()
   {
     
       a = new ArrayList<T>(); 
      top=-1;
   }
   
   void push(T data)
   {
      top++;
      a.add(data);
      
   }
   
   T pop()
   {
      return a.get(top--);
   }
   
   boolean hasElements()
   {
      return top!=-1;
   }
 }

class Student
{
   String name;
   int sem;
   Student(String n,int s)
   {
      name=n;
      sem=s;
   }
   public String toString()
   {
      return name +"  "+ sem;
   }
}
class Generics
{
   public static void main(String arg[])
   {
      Stack<Integer> gInt=new Stack<Integer>();  // Integer objects
      Stack<Double> gDouble=new Stack<Double>();  // Double objects
      Stack<Student> gStudent=new Stack<Student>();  //Student objects
      gInt.push(10);
      gInt.push(20);
      gInt.push(30);
 
      gDouble.push(1.2);
      gDouble.push(2.3);
      gDouble.push(3.4);
      gDouble.push(4.56);
 
      gStudent.push( new Student("Harry",2) );
      gStudent.push( new Student("Percy",3) );
      gStudent.push( new Student("Maxon",7) );
      gStudent.push( new Student("Rhys",5) );

      System.out.println("\nIntegers stack elements:");
      while(gInt.hasElements())
      {
            System.out.println(gInt.pop());
      }
 
      System.out.println("\nDouble stack elements: ");
      while(gDouble.hasElements())
      {
             System.out.println(gDouble.pop());
      }
 
      System.out.println("\nStudents object elements");
      System.out.println("Name | Sem");

      while(gStudent.hasElements())
      {
         System.out.println(gStudent.pop());
      }
   }
}