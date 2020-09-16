/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occurencestring;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
public class Occurencestring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String sentance="welcome to java welcome java";
        
        int count;
        sentance=sentance.toLowerCase();
        String words[]=sentance.split(" ");
        for(int i=0;i<words.length;i++)
        {
            count=1;
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;
                    words[j]="0";
                }
            
            
            }
                if(count>1&&words[i]!="0")
                {
                   System.out.println("the occurence of word:"+words[i]);
                   System.out.println("no of occurence is:"+count);
                }
                else
                {
                   continue;
                }
        }
            
        
    }
    
}
