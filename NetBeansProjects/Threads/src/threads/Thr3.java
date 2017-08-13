
package threads;

/**
 *
 * @author Muhmmad Hussain
 */
class Thread4 implements Runnable
{
    String x;
    Thread4(String name)
    {
        x=name;
    }
    
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.print(x);
        }
    }
}
public class Thr3 {
    public static void main(String[] args) {
        
        Thread4 obj1=new Thread4(("A"));
        Thread t1=new Thread(obj1);
        t1.start();
        
        Thread4 obj2=new Thread4(("B"));
        Thread t2=new Thread(obj2);
        t2.start();
    } 
}
