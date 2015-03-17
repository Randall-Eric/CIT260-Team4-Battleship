/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.cit260group4BattleshipMenus;

import cit260.team4.battleship.AuthorCreditView;
import java.util.Scanner;

/**
 *
 * @author erandall
 */
public class HelpMenuView extends MenuSuperClass {    
    
    public final static String [][] menuItems = {
        {"R", "Rules"},
        {"O", "Objective"},
        {"D", "Difficulty"},
        {"E", "Developers"},
        {"X", "Exit"}
    };
    
    private final HelpMenuControl helpMenuControl = new HelpMenuControl();
    private final AuthorCreditView authorCreditView = new AuthorCreditView();
    
    public HelpMenuView(){
        super(HelpMenuView.menuItems);
    }
    
    public void helpInput(){
        
            String command;
            Scanner inFile = new Scanner(System.in);
            
            do{
                this.display();
                
                command = inFile.nextLine();
                command = command.trim().toUpperCase();
                
                switch (command){
                    case "R":
                        this.helpMenuControl.displayRulesHelp();
                        break;
                    case "O":
                        this.helpMenuControl.displayObjectiveHelp();
                        break;
                    case "D":
                        this.helpMenuControl.displayDifficultyHelp();
                        break;
                    case "E":
                        this.authorCreditView.authorInput();
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
