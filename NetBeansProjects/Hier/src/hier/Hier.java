/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hier;

/**
 *
 * @author Muhmmad Hussain
 */
class A
{
  public void methodA()
  {
     System.out.println("Parent Class Method");
  }
}
class B extends A
{
  public void methodB()
  {
     System.out.println("method of Class B");
  }
}
class C extends A
{
 public void methodC()
 {
 System.out.println("method of Class C");
 }
}
class D extends A
{
  public void methodD()
  {
     System.out.println("method of Class D");
  }
}
public class Hier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B ob1=new B();
        C ob2=new C();
        D ob3=new D();
        
        ob1.methodA();
        ob2.methodA();
        ob3.methodA();
        
    }
    
}
