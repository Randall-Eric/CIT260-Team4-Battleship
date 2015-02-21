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
     
    /**public void lessonSix(String[ ] args)
     {
             String[ ] names = {"Dave", "Matt", "Tammy", "Eric", "Jordan", "Christian", "Taylor"};
             lessonSixSorted (names);
             for ( int k = 0;  k < 4;  k++ )
                System.out.println( names [ k ] );
      }

      public void lessonSixSorted(String  x [ ] )
      {
          
            int j;
            boolean flag = true;  // will determine when the sort is finished
            String temp;

            while ( flag )
            {
                  flag = false;
                  for ( j = 0;  j < x.length - 1;  j++ )
                  {
                          if ( x [ j ].compareToIgnoreCase( x [ j+1 ] ) > 0 )
                          {                                             // ascending sort
                                      temp = x [ j ];
                                      x [ j ] = x [ j+1];     // swapping
                                      x [ j+1] = temp; 
                                      flag = true;
                           } 
                   } 
            } 
      } 
    */
    
    String returnOutput;
    String playerTurnOutput;
    String [] movesary = 
                {"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1", "I1", "J1",
                 "A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2", "I2", "J2",
                 "A3", "B3", "C3", "D3", "E3", "F3", "G3", "H3", "I3", "J3",
                 "A4", "B4", "C4", "D4", "E4", "F4", "G4", "H4", "I4", "J4",
                 "A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5", "I5", "J5",
                 "A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6", "I6", "J6",
                 "A7", "B7", "C7", "D7", "E7", "F7", "G7", "H7", "I7", "J7",
                 "A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8", "I8", "J8",
                 "A9", "B9", "C9", "D9", "E9", "F9", "G9", "H9", "I9", "J9",
                 "A10", "B10", "C10", "D10", "E10", "F10", "G10", "H10", "I10", "J10"} ;
    //float rowFloat;
    //String aircraftCarrier = "A";
    //String patrolBoat = "C";
    //int aircraftHit = 1; //will be an array?
    //int patrolHit = 4; //will also be an array?
    int x = 1;
    
    public void playGame () {
    
        String moves = "";
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your move: ");
        moves = kb.nextLine(); 
        
        if (!moves.equals(movesary))
        {
            returnOutput = ("Incorrect, please try again!!"); 
        }
        else {
            returnOutput = "Hit!";
            moves = kb.nextLine();
        }
}
    
    
    /**public boolean hitOrMiss() {
        
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
*/
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

