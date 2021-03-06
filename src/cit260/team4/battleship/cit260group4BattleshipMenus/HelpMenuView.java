/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.cit260group4BattleshipMenus;

import cit260.team4.battleship.creatorinfo.AuthorCreditView;
import cit260.team4.battleship.interfaces.EnterInfo;
import java.util.Scanner;
import cit260.team4.battleship.frames.HelpFrame;
/**
 *
 * @author erandall
 */
public class HelpMenuView extends MenuSuperClass implements EnterInfo{    
    private static HelpFrame helpFrame;
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
    
    @Override
    public String getInput(Object object){
             
        
        String command;
            Scanner inFile = new Scanner(System.in);
            
            do{
                this.display();
                
                command = inFile.nextLine();
                command = command.trim().toUpperCase(); //changes input to always be uppercase, in case someone inputs a lowercase letter. 
                
                
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
            return command;
    }
        
}
