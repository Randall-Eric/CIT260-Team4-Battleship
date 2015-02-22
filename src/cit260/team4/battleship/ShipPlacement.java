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
    int shipTable[][] = new int[5][];{
    shipTable[0] = new int[5];
    shipTable[1] = new int[4];
    shipTable[2] = new int[3];
    shipTable[3] = new int[3];
    shipTable[4] = new int[2];
    }
      
    public void shipPlacement() {
    
    
    
    int i = 0;
        
    while (i < 5) 
        one: 
        {   
    
        Scanner input = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Enter the " + ships[i] + " start column: ");
        String columnLetter = input.next();
        columnLetter = columnLetter.trim().toUpperCase();
        column = columnValue(columnLetter); //calls function to convert column letter to number
        
        System.out.println("Enter the " + ships[i] + " start row: ");
        row = input.nextInt();  
        
        System.out.println("What is the direction of the " + ships[i] + " (ex. up, down, left, right)");
        direction = input.next();
        direction = direction.trim().toUpperCase();
        
        int extension = shipExtension(i); //calls function to get full number of ships
        
        int shipOccupiedSpace[] = shipDirection(direction, column, row, extension); //calls function to add or subtract for direction of ship
        
        for(int x: shipOccupiedSpace){
                if (x <= 100 && x >= 11)
                for(int y[]: shipTable)
                    for(int z: y){
                        if (z != x){
                           continue;
                        }
                        else{
                            System.out.print("\nSelection already taken by other ship.\n");
                            break one;
                        }
                    }
                   
            
                else{
                    System.out.print("\nSelection is out of board boundaries.\n");
                    break one;
                }

        }
                System.out.print("\n" + ships[i] + " placed.\n");
                shipTable[i] = shipOccupiedSpace;
                i++;
    }
    
    System.out.print("Ships placed. Get ready for the game!!!\n");
    
    }
    
    public void shipMaximum(){
        int largest = shipTable[0][0];
        for(int y[]: shipTable){
                    for(int z: y){
                        if(largest > z){
                            largest = z;
                            System.out.print("The largest value for a ship is " + largest);
                        }
                    }
        }
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
               value = 10;
               break;
           case "B":
               value = 20;
               break;
           case "C":
               value = 30;
               break;
           case "D":
               value = 40;
               break;
           case "E":
               value = 50;
               break;
           case "F":
               value = 60;
               break;
           case "G":
               value = 70;
               break;
           case "H":
               value = 80;
               break;
           case "I":
               value = 90;
               break;
           case "J":
               value = 100;
               break;
           default:
               value = 1000;
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
                    shipSpaces[i] = column + (row - i);
               break;
           case "DOWN":
               for(i = 0; i <= ext; i++)
                    shipSpaces[i] = column + (row + i);
               break;
           case "LEFT":
               for(i = 0; i <= ext; i++)
                    shipSpaces[i] = row + (column - (i * 10));
               break;
           case "RIGHT":
               for(i=0; i <= ext; i++)
                    shipSpaces[i] = row + (column + (i * 10));
               break;
           default:
               for(i=0; i <= ext; i++)
                   shipSpaces[i] = 1000;
               break;
       }
       
       return shipSpaces;
   }

}