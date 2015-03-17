/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.Menus;

import java.util.Scanner;

/**
 *
 * @author erandall
 */
public class SettingsMenuView extends MenuSuperClass {
    
     private final static String [][] menuItems = {
        {"D", "Set Difficulty"},
        {"M", "Set Game Mode"},
        {"H", "Enable Hints"},
        {"T", "Total Games"},
        {"X", "Exit"}
    };
    
    private final SettingsMenuControl settingsMenuControl = new SettingsMenuControl();

    public SettingsMenuView(){
        super(SettingsMenuView.menuItems);
        
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
}