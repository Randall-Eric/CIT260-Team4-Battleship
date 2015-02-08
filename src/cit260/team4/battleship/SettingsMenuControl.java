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
public class SettingsMenuControl {
    
    float difficultyFloat;
    int difficulty;     //0=easy, 1=hard
    int hints;          //0=disabled, 1=enabled
    int gamemode;       //Gamemode - normal=0, all battleships=1, multishot=2

    
    //public SettingsMenuControl(){
        
    //}
    
    public void displayDifficulty(){
        System.out.println();
        this.displaySettingsBorder();
                int x = 1;
        while (x != 0) {
            Scanner input = new Scanner(System.in);
            try {
                System.out.println("\tEnter the difficulty setting, \n\t  0\tEasy\n\t  1\tHard");
                difficultyFloat = input.nextFloat();
                difficulty = (int)difficultyFloat;
                
                    if (difficulty == 0){
                        System.out.println("\tDifficulty Setting = Easy");
                        x--;
                    }
                    else if (difficulty == 1){
                        System.out.println("\tDifficulty Setting = Hard");
                        x--;
                    }
                    else
                        System.out.println("This is not a vaild response.");
            }
            catch(InputMismatchException e){
                System.out.println("This is not a valid response.");
            }        
        }
        displaySettingsBorder();
    }
    
    public void displayGameMode(){
        System.out.println();
        displaySettingsBorder();
        System.out.println(
                "\tThe Game Mode option will be located here");
        displaySettingsBorder();
        
    }
    
    public void displayHints(){
        System.out.println();
        displaySettingsBorder();
        System.out.println(
                "\tThe Hints option will be located here");
        displaySettingsBorder();
    }
    
    public void displaySettingsBorder (){
        System.out.println(
        "\t******************************************************************");
    }
    
}
