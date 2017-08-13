
package threads;

/**
 *
 * @author Muhmmad Hussain
 */
class Thread1 extends Thread
{
     Thread1(String name)
            {
                super(name);
            }
            
            public void run()
            {
                for (int i=0;i<10;i++)
                {
                    System.out.print(this.getName());
                }
            }
}
    public class Threads extends Thread{
    public static void main(String[] args) {
        // TODO code application logic here
    Thread1 t1=new Thread1("A");
    
    t1.start();
    
    Thread1 t2=new Thread1("B");
    
    t2.start();
   }
   }
