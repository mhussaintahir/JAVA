
package threads;

class Thread5 implements Runnable
{
    String x;
    Thread t1;
    Thread t2;
    
    Thread5(String name)
    {
        x=name;
    }
    Thread5(Thread5 obj)
    {
        t1=new Thread(obj);
        t1.start();
        
        t2=new Thread(obj);
        t2.start();
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.print(x);
        }
    }
}
public class Thr4 {
    public static void main(String[] args) {
        
        Thread5 obj1=new Thread5(("A"));
        Thread5 obj2=new Thread5(obj1);
        
        Thread5 obj3=new Thread5(("B"));
        Thread5 obj4=new Thread5(obj3);
     }   
}
