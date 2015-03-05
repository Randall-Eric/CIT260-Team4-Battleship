/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class ScoreBoardMenuView {
    


    
    private final static String [][] menuItems = {
        {"P", "Ship Point Values"},
        {"S", "Player Stats"},
        {"V", "View High Score"},
        {"X", "Exit"}
    };
    
    private ScoreBoardMenuControl scoreBoardMenuControl = new ScoreBoardMenuControl();
    
    public ScoreBoardMenuView(){
        
    }
    
    public void scoreBoardMenuInput(){
        
            String command;
            Scanner inFile = new Scanner(System.in);
            
            do{
                this.display();
                
                command = inFile.nextLine();
                command = command.trim().toUpperCase();
                
                switch (command){
                    case "P":
                        this.scoreBoardMenuControl.displayShipPointValue();
                        break;
                    case "S":
                        this.scoreBoardMenuControl.displayPlayerStats();
                        break;
                    case "V":
                        this.scoreBoardMenuControl.displayViewHighScore();
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
        System.out.println("\tEnter the letter for your selection from the Score Board Menu:");
        
        for (String[] menuItem : ScoreBoardMenuView.menuItems) {
            System.out.println("\t  " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t************************************************************\n");
    }
}
