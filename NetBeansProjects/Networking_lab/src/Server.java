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

public class Server {
    public static void main(String[] args) throws IOException
    {
        
        int n1,n2,add;
        
        ServerSocket ss=new ServerSocket(1340);
        
        System.out.println("Waiting for COnnection Request");
        
        Socket s1=ss.accept();
        
        System.out.println("Request Accepted");
        
        Scanner sc=new Scanner(s1.getInputStream());
        n1=sc.nextInt();
        n2=sc.nextInt();
        
        add=n1+n2;
        
        System.out.println("Addition at Server = "+add);
        
        PrintStream p=new PrintStream(s1.getOutputStream());
        
        p.println(add);
        
        
    }
}
