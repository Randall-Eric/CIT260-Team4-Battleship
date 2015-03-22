/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

/**
 *
 * @author urander
 */
public enum SettingsEnum {
    G("Gamemode is set to normal"),
    D("Difficulty is set to easy"),
    H("Hints are set to off"),
    X("Exit");
    
    String message;
    
    private SettingsEnum(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }  
    public void display(){
        System.out.println(this.message);
    }
}