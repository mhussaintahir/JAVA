/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Muhmmad Hussain
 */
class Thread3 extends Thread
{
    int x;
    
     Thread3(int n)
            {
                x=n;
            }
            
            public void run()
            {
                for (int i=1;i<=10;i++)
                {
                    System.out.println(x+" * "+i+" = "+i*x);
                }
            }
}

public class Thr2 {
    public static void main(String[] args) {
        
   Thread3 t1=new Thread3(2);
   
   t1.start();
   
   Thread3 t2=new Thread3(5);
   
   t2.start();
    
    }
   
}
