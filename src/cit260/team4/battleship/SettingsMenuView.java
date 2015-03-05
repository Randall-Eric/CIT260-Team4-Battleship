/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

import java.util.Scanner;

/**
 *
 * @author erandall
 */
public class SettingsMenuView {
    
     private final static String [][] menuItems = {
        {"D", "Set Difficulty"},
        {"M", "Set Game Mode"},
        {"H", "Enable Hints"},
        {"T", "Total Games"},
        {"X", "Exit"}
    };
    
    private final SettingsMenuControl settingsMenuControl = new SettingsMenuControl();

    public SettingsMenuView(){
        
    }
    
    public void settingsInput(){
        
            String command;
            Scanner inFile = new Scanner(System.in);
            
            do{
                this.display();
                
                command = inFile.nextLine();
                command = command.trim().toUpperCase();
                
                switch (command){
                    case "D":
                        this.settingsMenuControl.displayDifficulty();
                        break;
                    case "M":
                        this.settingsMenuControl.displayGameMode();
                        break;
                    case "H":
                        this.settingsMenuControl.displayHints();
                        break;
                    case "T":
                        this.settingsMenuControl.gameCount();
                        break;
                    case "X":
                        break;
                    default:
                        System.out.println("Invalid Choice. Please select another option.");
                }
            } 
            while (!command.equals("X"));
    }
        
    private void display (){
        System.out.println("\n\t************************************************************");
        System.out.println("\tEnter the letter for your selection from the help menu:");
        
         for (String[] menuItem : SettingsMenuView.menuItems) {
             System.out.println("\t  " + menuItem[0] + "\t" + menuItem[1]);
         }
        System.out.println("\t************************************************************\n");
    }
}