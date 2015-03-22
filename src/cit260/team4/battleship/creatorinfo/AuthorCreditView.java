/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.creatorinfo;

import cit260.team4.battleship.creatorinfo.AuthorCreditControl;
import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class AuthorCreditView {
        private final static String [][] menuItems = {
        {"M", "Matthew Sweeney"},
        {"E", "Eric Randall"},
        {"C", "Christian Ray"},
        {"T", "Taylor Westmoreland"},
        {"J", "Jordan Smith"},
        {"D", "David Banks"},
        {"R", "Rebecca Thayne"},
        {"X", "Exit"}
    };
    
    public final AuthorCreditControl authorCreditControl = new AuthorCreditControl();
  
    
    public AuthorCreditView(){
        
    }
    
    public void authorInput(){
        
            String command;
            Scanner inFile = new Scanner(System.in);
            
            do{
                this.display();
                
                command = inFile.nextLine();
                command = command.trim().toUpperCase();
                
                switch (command){
                    case "M":
                        this.authorCreditControl.displayMatthewSweeney();
                        break;
                    case "E":
                        this.authorCreditControl.displayEricRandall();
                        break;
                    case "C":
                        this.authorCreditControl.displayChristianRay();
                        break;
                    case "T":
                        this.authorCreditControl.displayTaylorWestmoreland();
                        break;
                    case "J":
                        this.authorCreditControl.displayJordanSmith();
                        break;
                    case "D":
                        this.authorCreditControl.displayDavidBanks();
                        break;
                    case "R":
                        this.authorCreditControl.displayRebeccaThayne();
                        break;
                    case "X":
                        break;
                    default:
                        System.out.println("Invalid Choice. Please select another option.");
                        continue;
                }
            } 
            while (!command.equals("X"));
                return;
    }
        
    public final void display (){
        System.out.println("\n\t************************************************************");
        System.out.println("\tEnter a letter to learn more about each of the game designers:");
        
        for (int i = 0; i < AuthorCreditView.menuItems.length; i++){
            System.out.println("\t  " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t************************************************************\n");
    }
}

