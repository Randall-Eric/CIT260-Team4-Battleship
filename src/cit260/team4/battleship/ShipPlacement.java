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
        
    int column;
    int row;
    String direction;
    String ships[] = {
            "Carrier", "Battleship", "Submarine", "Destroyer", "Patrol"
    };
    
    String columns[] = {
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"
    };
      
    public void shipPlacement() {
    
    int i = 0;
        
    while (i < 5) {   
        
        Scanner input = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Enter the " + ships[i] + " start column: ");
        String columnLetter = input.next();
        columnLetter = columnLetter.trim().toUpperCase();
        System.out.println("Enter the " + ships[i] + " start row: ");
        row = input.nextInt();   
        System.out.println("What is the direction of the " + ships[i] + " (ex. up, down, left, right)");
        direction = input.next();
        
        int extension = shipExtension(i);
        column = columnValue(columnLetter);
    
            if (column <=10 && column >= 1){ 
                
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
   
   public int columnValue (String column){
       
       int value;
       
       switch(column) {
           case "A":
               value = 1;
               break;
           case "B":
               value = 2;
               break;
           case "C":
               value = 3;
               break;
           case "D":
               value = 4;
               break;
           case "E":
               value = 5;
               break;
           case "F":
               value = 6;
               break;
           case "G":
               value = 7;
               break;
           case "H":
               value = 8;
               break;
           case "I":
               value = 9;
               break;
           case "J":
               value = 10;
               break;
           default:
               value = 100;
               break;
       }
       return value;    
   }
    
}