/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

/**
 *
 * @author erandall
 */
public class Settings {
    int difficulty = 0;     //0=easy, 1=hard
    int hints = 0;          //0=disabled, 1=enabled
    int gamemode = 0;       //Gamemode - normal=0, all battleships=1, multishot=2
    
    public void showDifficulty(){       
                System.out.println("Difficulty Setting = "+ difficulty);
    }
}