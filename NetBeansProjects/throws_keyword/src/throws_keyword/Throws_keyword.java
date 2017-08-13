/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throws_keyword;

/**
 *
 * @author Muhammad Hussain
 */

public class Throws_keyword {

    /**
     * @param args the command line arguments
     */ static void demoproc()
    {
        try{
            throw new NullPointerException();
        }
        catch(NullPointerException e)
        {
            System.out.println("catch inside demo proc");
            throw e;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            demoproc();
        }
        catch(NullPointerException e)
        {
            System.out.println("recaugth"+e);
        }
    }
    
}
