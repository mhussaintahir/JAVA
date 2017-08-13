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

public class UDP_Server {

    public static void main(String[] args) throws Exception
    {
        DatagramSocket ds=new DatagramSocket(9999);
        
        byte[]b=new byte[1024];
        
        DatagramPacket dp=new DatagramPacket(b, b.length);
        
        ds.receive(dp);
        
        String data=new String(dp.getData());
        
        System.out.println("Recieved = "+data);
        
        int num=Integer.parseInt(data.trim());
        
        int sq=num*num;
        
        System.out.println("Square = "+sq);
        
        byte[]b1=String.valueOf(sq).getBytes();
        
        InetAddress ip=InetAddress.getByName("127.0.0.1");
        
        DatagramPacket dp1=new DatagramPacket(b1, b1.length, ip, dp.getPort());
        
        ds.send(dp1);
    }
    
}
