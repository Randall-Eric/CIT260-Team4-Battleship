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
        direction = direction.trim().toUpperCase();
        
        int extension = shipExtension(i); //calls function to get full number of ships
        column = columnValue(columnLetter); //calls function to convert column letter to number
        int shipOccupiedSpace[] = shipDirection(direction, column, row, extension); //calls function to add or subtract for direction of ship
        
        one:    if (direction.equals("UP") || direction.equals("DOWN")){
            
            int rows[] = new int[shipOccupiedSpace.length];
            System.arraycopy(shipOccupiedSpace, 0, rows, 0, shipOccupiedSpace.length);
            
            for(int x: rows){
                if (x <=10 && x >= 1)
                    continue;
                else
                    System.out.print("Selection out of board boundaries.\n");
                    break one;
            }
            if (column <=10 && column >= 1){
                        System.out.print(ships[i] + " placed.\n");
                        i++;
            }
            else 
                System.out.print("Selection out of board boundaries.\n");
                
        }    
        
        
        else{
            
            int columns[] = new int[shipOccupiedSpace.length];
            System.arraycopy(shipOccupiedSpace, 0, columns, 0, shipOccupiedSpace.length);
            
            for(int x: columns){
                if (x <=10 && x >= 1)
                    continue;
                else
                    System.out.print("Selection out of board boundaries.\n");
                    break one;
            }
            if (row <=10 && row >= 1){
                        System.out.print(ships[i] + " placed.\n");
                        i++;
            }
            else 
                System.out.print("Selection out of board boundaries.\n");
                
        }  
}
    
    System.out.print("Ships placed. Get ready for the game!!!");

}
  
    
   //Function to get full number of spaces occupied by each ship 
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
   
   //Function to convert column letter to number.
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
   
   //Adds or subtracts to row or column depending on ship direction
   public int[] shipDirection(String direction, int column, int row, int ext) {
       
       int shipSpaces[] = new int[ext + 1];
       int i;
       
       switch(direction){
           case "UP":
               for(i = 0; i <= ext; i++)
                    shipSpaces[i] = row - i;
               break;
           case "DOWN":
               for(i = 0; i <= ext; i++)
                    shipSpaces[i] = row + i;
               break;
           case "LEFT":
               for(i = 0; i <= ext; i++)
                    shipSpaces[i] = column - i;
               break;
           case "RIGHT":
               for(i=0; i <= ext; i++)
                    shipSpaces[i] = column + i;
               break;
           default:
               for(i=0; i <= ext; i++)
                   shipSpaces[i] = 100;
               break;
       }
       
       return shipSpaces;
   }
    
}