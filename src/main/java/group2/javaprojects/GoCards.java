/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group2.javaprojects;

/**
 *
 * @author Nickolas
 */
public class GoCards {
    public static void main(String[] args){
        //Loop iterates 100 times
        for(int count = 1; count <= 100; count++){
            // Prints "Go Cards" upon condition
            if(count % 4 == 0 && count % 7 == 0)
                System.out.println("GO Cards!");
            // prints "cards!" upon condition
            else if(count % 7 == 0)
                System.out.println("Cards!");
            // prints "Go" upon Condition
            else if(count % 4 == 0)
                System.out.println("GO");
            else
                System.out.println(count);
                      
        }
    }
}
