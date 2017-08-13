/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab5
 */
import java.net.*;
import java.io.*;
import java.util.*;

 class Client {
    public static void main(String[] args) throws UnknownHostException,IOException
    {
        int n1,n2,sum;
        
        Socket s=new Socket("127.0.0.1",1340);
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter first number");
        
        n1=input.nextInt();
        
        System.out.println("Enter second number");
        
        n2=input.nextInt();
        
        PrintStream p=new PrintStream(s.getOutputStream());

        p.println(n1);
         p.println(n2);
        
        Scanner sc=new Scanner(s.getInputStream());
        
        sum=sc.nextInt();
        System.out.println("Addition = "+sum);
    }
}
