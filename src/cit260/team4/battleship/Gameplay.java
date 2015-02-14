/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

import java.util.Scanner;

/**
 *
 * @author dbanks
 */
public class Gameplay {
     
    String returnOutput;
    String playerTurnOutput;
    String column;
    float rowFloat;
    String aircraftCarrier = "A";
    String patrolBoat = "C";
    int aircraftHit = 1; //will be an array?
    int patrolHit = 4; //will also be an array?
    int x = 1;
    
    public boolean hitOrMiss() {
        
        Scanner input = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Enter the column: ");
        column = input.next();
        System.out.println("Enter the row: ");
        rowFloat = input.nextFloat();
        int row = (int)rowFloat;
        

        if (column.equals("A") || column.equals("B") || column.equals("C") || column.equals("D") || column.equals("E") 
            || column.equals("F") || column.equals("G") || column.equals("H") || column.equals("I") ||column.equals("J")){ //inside bounds
            
            if (row <=10 && row >= 1){ //embedded if statement that checks for Aircraft carrier hits
                if(column.equals(aircraftCarrier) && row == aircraftHit){
                    returnOutput = "Hit - Aircraft carrier!";
                    
                
                    do{//do\while statment that give the player a score for amount of spaces hit for Aircraft carrier. 
                       //When array is finished, it will be one point per hit. 
                        System.out.print("Player 1's score: " + x + " ");
                        System.out.print("\n);");
                        x++;
                            }while (x <= 5); 
                    playerTurnOutput="It is now the computers turn!";
                    return true;
                    
                }
                
                else if (column.equals(patrolBoat) && row == patrolHit){ //embedded else if statment that checks for Patrol boat hits
                    returnOutput = "Hit - Patrol Boat!";
                    
                    do{//do\while statment that give the player a score for amount of spaces hit for Patrol boat. 
                       //When array is finished, it will be one point per hit.
                        System.out.print("Player 1's score: " + x + " ");
                        System.out.print("\n\r);");
                        x++;
                            }while (x <= 2); 
                return true;
                }
                
            else 
                returnOutput = "Miss!";
                return false;
            }
        }
            else
                returnOutput="Invalid Input";
                System.out.println("\t Invalid \n Input");
        return false;
    }
  public String isSunk(int hitsPossible, int hitsTaken){
     float hitsRemaining = hitsPossible - hitsTaken;
     int hitsLeft = (int)hitsRemaining;
     if (hitsLeft == 0){
         return "Ship is sunk!\n\r";
     }
     else if (hitsLeft < 0){
         return "Error\n\r";
     }
     
     return "Ship has " + hitsLeft + " hits remaining.\n\r";
  }  

  public static String [][] gameExit = {//sets up the exit option.  
        {"X", "Exit"}
    };
  
  public void gameExit(){  
    String command;
            Scanner inFile = new Scanner(System.in);
    do{
                this.exit();
                
                command = inFile.nextLine();
                command = command.trim().toUpperCase(); //changes input to always be uppercase, in case someone inputs a lowercase letter. 
                
                switch (command) {
                        case "X":  //breaks from the Gameplay class. 
                        break;
                    default:
                        System.out.println("Invalid Choice. Please select another option.");  //pints out an error when anything but x is selected.
                        break;
        }
        } 
            while (!command.equals("X")); //continues to run until X is selected to end it. 
                return;
    }

public void exit (){
        System.out.println("\n\t************************************************************"); //decoration. 
        
        for (int i = 0; i < Gameplay.gameExit.length; i++){
            System.out.println("\t  " + gameExit[i][0] + "\t" + gameExit[i][1]);
        }
        System.out.println("\t************************************************************\n");
    }

    void playerNames() {
        {
      int [] numbers = {1, 2, 3, 4, 5, 6, 7};

      for(int x : numbers ){
         System.out.print( "Player " + x + "   " );
      }
      System.out.print("\n");
      String [] names ={"Dave    ", "   Taylor   ", "  Rebecca  ", "  Eric     ","  Christian  ", "Jordan     ", "Matt   "};
      for( String name : names ) {
         System.out.print( name );

      }
   }
    }
}

