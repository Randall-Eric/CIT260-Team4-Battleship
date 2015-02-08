/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

import java.util.Scanner;

/**
 *
 * @author taylorwestmorland
 */
public class GameStatusMenuView {
    
    private final static String[][]menuItems = {
        {"S", "Game Score"},
        {"T", "Time spent on game"},
        {"CS", "Curent Settings (Takes you to the settings menu)"},
        {"X", "Exit Game"},
    };
    
    private GameStatusMenuControl gameStatusMenuControl= new GameStatusMenuControl();
    
    public GameStatusMenuView(){
        
    }
    
    public void theInput(){
        
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do{
            this.display();
            
            command=inFile.nextLine();
            command=command.trim().toUpperCase();
            
            switch(command){
                case "S":
                    this.gameStatusMenuControl.displayGameScoreHelp();
                    break;
                case "T":
                    this.gameStatusMenuControl.displayTimeOfGameHelp();
                    break;
                case "CS":
                    this.gameStatusMenuControl.displayCurrentHelp();
                    break;
                case "X":
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    continue;     
            }
        } 
        while (!command.equals("X"));
        return
        
    }
    
    public final void display(){
        System.out.println("\n\t************************************************************");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        
        for(int i=0; i< GameStatusMenuView.menuItems.length; i++){
            System.out.println("\t    " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t**************************************************************");
    }
}
