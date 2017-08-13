
package threads;

/**
 *
 * @author Muhmmad Hussain
 */
class Thread2 extends Thread
{
     Thread2(String name)
            {
                super(name);
                start();
            }
            
            public void run()
            {
                for (int i=0;i<10;i++)
                {
                    System.out.print(this.getName());
                }
            }
}
public class Thr1 {
    public static void main(String[] args) {
        
    Thread2 t1=new Thread2("A");
    
    Thread2 t2=new Thread2("B");
    
    Thread2 t3=new Thread2("C");
    
    }
   }
