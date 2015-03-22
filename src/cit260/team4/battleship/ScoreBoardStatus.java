/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

/**
 *
 * @author taylorwestmorland
 */
public enum ScoreBoardStatus {
    P("Aircraft Carrier = 5 points "),
    S("The player stats are:"),
    V("The current high score of the game is 154."),
    X("Exit");
    
    String message;
    
    private ScoreBoardStatus(String message){
        this.message = message;
    }
    
    
    public String getMessage(){
        return message;
    }
    
    public void display(){
        System.out.println(this.message);
    }
}
