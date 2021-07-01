package cpack;

import apack.*;
public class C{
      public void display(){
      System.out.println("In class C package cpack");
      System.out.println("Default, private, protected cant be printed in different package non subclass");
      apack.A obj= new apack.A();
    
      System.out.println("n4= "+obj.n4);
   }
}
