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

public class UDP_Client {
    
    public static void main(String[] args) throws Exception
    {
        DatagramSocket ds=new DatagramSocket();
        int i=8;
        
        byte[]b=String.valueOf(i).getBytes();
        InetAddress ip;
        ip=InetAddress.getByName("127.0.0.1");
        
        DatagramPacket dp=new DatagramPacket(b, b.length, ip, 9999);
        
        ds.send(dp);
        
        byte[] b1=new byte[1024];
        
        DatagramPacket dp1=new DatagramPacket(b1, b1.length);
        
        ds.receive(dp1);
        
        String msg=new String(b1);
        
        System.out.println("Message from Server\n "+"Squrae = "+msg);
        
        
       
    }
    
}
