/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author christianray
 */
public class Ships {
    int size=4;
    String name="Battleship"; 
    //String battleship = "You have chosen the Battleship";
    
  private ShipMenu shipmenu = new ShipMenu();
  
  public Ships(){
  
  }
    
    public void showSize(){
        System.out.println("The ship's size is: " + size);
}
    public void showName(){
        System.out.println("The ship's name is: " + name);
    }
    public void getAccuracy(int hits, int shots){
        
        double dShots = (double) shots;
        double dHits = (double) hits;
        double accuracy =0;
        
        if (shots == 0) 
            System.out.println("\tThe Player\'s accuracy is Zero");
        else if(shots < hits)
            System.out.println("\tInvalid Input");
        else {
            accuracy = (dHits/dShots)*100;
            System.out.println("\tThe Player\'s accuracy is " + accuracy + "%");
        }
    }
    public void shipInput(){
        Scanner input = new Scanner(System.in);
        try{
        int choice;
        
    
             do {
       
        System.out.println("Make your choice: ");
        System.out.println("1. Battleship");
        System.out.println("2. Cruiser");
        System.out.println("3. Aircraft Carrier");
        System.out.println("4. Patrol Boat");
        System.out.println("5. Exit");
        System.out.println("What will you choose?");
        choice = input.nextInt();
             
          
        switch(choice){
            case 1:
                this.shipmenu.showBattleship();
                break;
            case 2:
                this.shipmenu.showCruiser();
                break;
            case 3:
                this.shipmenu.showAircraftCarrier();
                break;
            case 4:
                this.shipmenu.showPatrolBoat();
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                this.shipmenu.showInvalid();
                break;
        }
            
            
        
                
        
        
        } while(choice != 5);}
      catch(InputMismatchException exception){
          System.out.println("\t----------------------------------------");
          System.out.println("\t\t *** INVALID INPUT ****");
          System.out.println("\t    *** PLEASE PUT AN INTEGER 1-5 ***");
          System.out.println("\t----------------------------------------");
      }  
    //return;
    }
    
    }

