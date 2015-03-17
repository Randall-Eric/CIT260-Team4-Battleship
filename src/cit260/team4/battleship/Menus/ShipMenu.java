package cit260.team4.battleship.Menus;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christianray
 */
public class ShipMenu {
   // Scanner input = new Scanner(System.in);
    //int choice;
        
public ShipMenu(){   
    
    /*do {
       choice = input.nextInt();
        System.out.println("Make your choice: ");
        System.out.println("1. Battleship");
        System.out.println("2. Cruiser");
        System.out.println("3. Aircraft Carrier");
        System.out.println("4. Patrol Boat");
        System.out.println("5. Exit");
        System.out.println("What will you choose?");
        
        switch(choice){
            case '1':
                System.out.println("You have chosen the BAttleship");
            case '2':
                System.out.println("You have chosen the Cruiser");
            case '3':
                System.out.println("You have chosen the Aircraft Carrier");
            case '4':
                System.out.println("You have chosen the Patrol Boat");
            case '5':
                System.out.println("Exiting...");
            default:
                System.out.println("Invalid Choice");
        }
            
         
        } while(choice != 5);
    return;
    }*/
}
public void showBattleship(){
    System.out.println("\t----------------------------------------");
    System.out.println("\t *** You have chosen the BATTLESHIP ***");
    System.out.println("\t----------------------------------------");
}
public void showCruiser(){
    System.out.println("\t----------------------------------------");
    System.out.println("\t *** You have chosen the CRUISER ***");
    System.out.println("\t----------------------------------------");
}
public void showAircraftCarrier(){
    System.out.println("\t----------------------------------------");
    System.out.println("\t *** You have chosen the AIRCRAFT CARRIER ***");
    System.out.println("\t----------------------------------------");
}
public void showPatrolBoat(){
    System.out.println("\t----------------------------------------");
    System.out.println("\t *** You have chosen the PAROL BOAT ***");
    System.out.println("\t----------------------------------------");
}
public void showInvalid(){
    System.out.println("\t----------------------------------------");
    System.out.println("\t\t *** INVALID CHOICE ***");
    System.out.println("\t----------------------------------------");
}
}