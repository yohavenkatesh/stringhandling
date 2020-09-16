/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenatestring;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Concatenatestring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String password,name;
        System.out.println("enter the name:");
        name=obj.next();
        System.out.println("enter the password:");
        password=obj.next();
        if(name.equals(password)) 
        {
            System.out.println("concatenate two string");
            System.out.println(name+password);
        }
        
        else 
        {
            System.out.println("The name and password are inequal!!!");
        }
    }
    
}
