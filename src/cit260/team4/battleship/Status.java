/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

/**
 *
 * @author Jordan
 */
public enum Status {
    S ("The current score of the game is."),
    T ("This game has been going for ____ minutes."),
    CS ("Here are the current settings that you have for this game."),
    X ("You are exiting the game");
    
    String message;
    
    private Status(String message){
        this.message = message;
    }
    
    
    public String getMessage(){
        return message;
    }
    
    public void display(){
        System.out.println(this.message);
    }
}


