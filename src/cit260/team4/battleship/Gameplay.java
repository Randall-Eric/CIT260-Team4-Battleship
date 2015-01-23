/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

/**
 *
 * @author dbanks
 */
public class Gameplay {
    String playername="Player 1";  
    String ainame="Computer";
  
    
    public void playerTurn(){
        System.out.println("It's your turn, " + playername);
}
    public void ai_Turn(){
        System.out.println("It's your turn " + ainame);
    }
}
