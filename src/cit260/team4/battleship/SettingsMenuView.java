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
        {"X", "Exit"}
    };
    
    private SettingsMenuControl settingsMenuControl = new SettingsMenuControl();

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
        System.out.println("\tEnter the letter for your selection from the help menu:");
        
        for (int i = 0; i < SettingsMenuView.menuItems.length; i++){
            System.out.println("\t  " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t************************************************************\n");
    }
}