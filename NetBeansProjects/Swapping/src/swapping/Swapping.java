/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapping;

/**
 *
 * @author Muhmmad Hussain
 */
public class Swapping {
    public static void swap(int[]arr1)
    {
        int temp;
        temp=arr1[0];
        arr1[0]=arr1[1];
        arr1[1]=temp;
        
    }

    public static void main(String[] args) {
        int[]arr=new int[2];
        arr[0]=3;
        arr[1]=8;
        System.out.println("Before Swapping "+arr[0]+" "+arr[1]);
        swap(arr);
        System.out.println("After Swapping "+arr[0]+" "+arr[1]);
        
        
    }
    
}
