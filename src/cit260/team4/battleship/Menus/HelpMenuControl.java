/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.Menus;

/**
 *
 * @author erandall
 */
public class HelpMenuControl {
    
    public HelpMenuControl(){
        
    }
    
    public void displayRulesHelp(){
        System.out.println();
        this.displayHelpBorder();
        System.out.println(
                "\tPlayers take turns guessing locations on a grid "
                +"to find and destroy their opponent's ships.  \nFirst player to"
                +"destroy all of their opponent's ships wins.");
        displayHelpBorder();
    }
    
    public void displayObjectiveHelp(){
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tThe objective of this game is to destroy the opponent's"
                + " ships before they destroy all of your ships.");
        displayHelpBorder();
        
    }
    
    public void displayDifficultyHelp(){
        System.out.println();
        displayHelpBorder();
        System.out.println(
                "\tEasy= your opponent chooses at random spots on the board.\n"
                + "Hard= your opponent uses strategy in placing thier ships.");
        displayHelpBorder();
    }
    
    private void displayHelpBorder (){
        System.out.println(
        "\t******************************************************************");
    }
}

