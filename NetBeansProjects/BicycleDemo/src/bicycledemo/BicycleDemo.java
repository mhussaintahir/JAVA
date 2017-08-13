
package bicycledemo;
import java.util.*;
interface Bicycle
{
    void changeCadence(int cC);
    void changeGear(int cG);
    void speedUp(int increment);
    void applyBrakes(int decrement);
    }
class Vehicle implements Bicycle
{
    public void changeCadence(int cC)
    {
        int changeCad= cC;
        System.out.println("Previous Cadence : 2 cycles/sec");
        System.out.println("Current Cadence : "+changeCad+" cycles/sec");
    }
    public void changeGear(int cG)
    {
        int changeGear1=cG;
        System.out.println("Previous Gear : 2nd");
        System.out.println("Current Gear : "+changeGear1);
        }
    public void speedUp(int increment)
    {
        int speedup=increment;
        System.out.println("Previous Speed : 20 km/h");
        System.out.println("Current speed : "+speedup+" km/h");
    }
    public void applyBrakes(int decrement)
    {
        int appBrakes=decrement;
        System.out.println("After Braking Speed : ");
        System.out.println("The speed is : "+appBrakes+" km/h");
    }}
public class BicycleDemo {
public static void main(String[] args) {
     
    Vehicle Bc= new Vehicle();
       Bc.changeCadence(4);
       Bc.changeGear(3);
       Bc.speedUp(26);
       Bc.applyBrakes(19); }}
