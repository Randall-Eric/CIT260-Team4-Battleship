/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author erandall
 */
public class Settings {
    float difficultyFloat;
    int difficulty;     //0=easy, 1=hard
    int hints;          //0=disabled, 1=enabled
    int gamemode;       //Gamemode - normal=0, all battleships=1, multishot=2
    
    public void selectDifficulty(){
        int x = 1;
        while (x != 0) {
            Scanner input = new Scanner(System.in);
            try {
                System.out.println("Enter the difficulty setting, \n 0=Easy 1=Hard: ");
                difficultyFloat = input.nextFloat();
                difficulty = (int)difficultyFloat;
                
                    if (difficulty == 0){
                        System.out.println("Difficulty Setting = Easy");
                        x--;
                    }
                    else if (difficulty == 1){
                        System.out.println("Difficulty Setting = Hard");
                        x--;
                    }
                    else
                        System.out.println("This is not a vaild response.");
            }
            catch(InputMismatchException e){
                System.out.println("This is not a valid response.");
            }        
        }
    }
}