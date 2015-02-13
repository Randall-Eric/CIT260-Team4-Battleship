/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

import java.util.Scanner;
/**
 *
 * @author Matthew
 */
public class ShipPlacement {
        
    String column;
    int row;
    String direction;
    String ships[] = {
            "Carrier", "Battleship", "Submarine", "Destroyer", "Patrol"
    };
      
    public void shipPlacement() {
    
    int i = 0;
        
    while (i < 5) {   
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the " + ships[i] + " start column: ");
        column = input.next();
        System.out.println("Enter the " + ships[i] + " start row: ");
        row = input.nextInt();   
        System.out.println("What is the direction of the " + ships[i] + " (ex. up, down, left, right)");
        direction = input.next();
        int extension = shipExtension(i);
    
            if (column.equals("A") || column.equals("B") || column.equals("C") || column.equals("D") || column.equals("E") 
            || column.equals("F") || column.equals("G") || column.equals("H") || column.equals("I") ||column.equals("J")){ 
                
                 if (row <=10 && row >= 1){
                     System.out.print(ships[i] + " placed.\n");
                     i++;              
                 }  
            }
            else 
                System.out.print("Selection out of board boundaries.\n");
        
    }
    
    System.out.print("Ships placed. Get ready for the game!!!");
}  
    
   public int shipExtension(int ship) {
       
       int ext;        
               
       switch(ship) {
           case 0:
               ext = 4;
               break;
           case 1:
               ext = 3;
               break;
           case 2:
               ext = 2;
               break;
           case 3:
               ext = 2;
               break;
           default:
               ext = 1;
               break;
       }
        return ext;
   } 
    
}