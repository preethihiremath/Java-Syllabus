package bpack;

import apack.*;
public class B extends apack.A{
      public void display(){
      System.out.println("In class B package bpack");
      System.out.println("Default, private cant be printed in different package subclass");
      //System.out.println("n1= "+n1);
      //System.out.println("n2= "+n2);
      System.out.println("n3= "+n3);
      System.out.println("n4= "+n4);
      }
}
