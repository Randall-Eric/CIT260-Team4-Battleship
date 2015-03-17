/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.Menus;

/**
 *
 * @author Jordan
 */
class ScoreBoardMenuControl {
    
public ScoreBoardMenuControl(){
        
    }
    
    public void displayShipPointValue(){
        System.out.println();
        this.displayScoreBoardBorder();
        System.out.println(
                "Aircraft Carrier = 5 points "
                +"\nBattleship = 4 points"
                +"\nSubmarine = 3 points"
                +"\nDestroyer = 3 points"
                +"\nPatrol Boat = 2 points");
        displayScoreBoardBorder();
    }
    
    public void displayPlayerStats(){
        System.out.println();
        displayScoreBoardBorder();
        System.out.println(
                "The player stats are:"
                +"\nJohn S. = 154 points"
                +"\nBecky T. = 148 points"
                +"\nMegan S. = 122 points"        
                +"\nTyson B. = 52 points");
        displayScoreBoardBorder();
        
    }
    
    public void displayViewHighScore(){
        System.out.println();
        displayScoreBoardBorder();
        System.out.println(
                "\tEThe current high score of the game is 154.");
        displayScoreBoardBorder();
    }
    
    private void displayScoreBoardBorder (){
        System.out.println(
        "\t******************************************************************");
    }
}

