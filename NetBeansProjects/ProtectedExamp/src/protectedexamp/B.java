/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protectedexamp;

/**
 *
 * @author Muhmmad Hussain
 */
class A
{
  protected int x;
  protected void protectedMethod()
  {
    System.out.println("This is protected");
  }
}
public class B extends A
{
  public static void main(String [] args)
  {
    A a = new A();
    a.protectedMethod();
  }
}
