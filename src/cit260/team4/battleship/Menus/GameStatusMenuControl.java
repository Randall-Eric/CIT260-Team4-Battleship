/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.Menus;

/**
 *
 * @author taylorwestmorland
 */
public class GameStatusMenuControl {
    
    public GameStatusMenuControl(){
        
    }
    
    public void displayGameScoreHelp(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "\tThe current score of the game is.");
        displayHelpBorder();
    }
    
    public void displayTimeOfGameHelp(){
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tThis game has been going for ____ minutes.");
        displayHelpBorder();
    }
    
    public void displayCurrentHelp(){
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tHere are the current settings that you have for this game.");
        displayHelpBorder();
    }
    
    public void displayHelpBorder(){
        System.out.println(
        "\t*******************************************************************");
    }
}
