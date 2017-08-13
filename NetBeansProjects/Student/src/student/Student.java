package student;
import java.util.Scanner;


interface I
{
    void input();
    void display1();
}
class Stud implements I
{
Scanner input=new Scanner(System.in);
String n;
int marks;

public void input()
{
    System.out.print("Enter Name : ");
    n=input.nextLine();
    System.out.print("Enter OOP marks : ");
    marks=input.nextInt();
    }
public void display1()
        {
            System.out.println(n);
            System.out.println(marks);
    }}
public class Student 
{
    public static void main(String[] args) {
      Stud obj1=new Stud();
      obj1.input();
      obj1.display1();
    }
    
}
