/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.cit260group4BattleshipMenus;

import java.util.Scanner;

/**
 *
 * @author taylorwestmorland
 */
public class GameStatusMenuView extends MenuSuperClass {
    
    public final static String[][]menuItems = {
        {"S", "Game Score"},
        {"T", "Time spent on game"},
        {"CS", "Curent Settings (Takes you to the settings menu)"},
        {"X", "Exit Game"},
    };
    
    private GameStatusMenuControl gameStatusMenuControl= new GameStatusMenuControl();
    
    public GameStatusMenuView(){
        super(GameStatusMenuView.menuItems);
        
    }
    
    public void gameStatusInput(){
        
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do{
            this.display();
            
            command=inFile.nextLine();
            command=command.trim().toUpperCase();
            
            switch(command){
                case "S":
                    System.out.println("The current score of the game is.");
                    break;
                case "T":
                    System.out.println("This game has been going for ____ minutes.");
                    break;
                case "CS":
                    System.out.println("Here are the current settings that you have for this game.");;
                    break;
                case "X":
                    System.out.println("You are exiting the game");
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    continue;     
            }
        } 
        while (!command.equals("X"));
        
        
   } 
    
}
