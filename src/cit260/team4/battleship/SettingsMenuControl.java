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
    String availableGamemodes[]={
        "Normal", 
        "All Battleships", 
        "All Carriers", 
        "All Destroyers", 
        "All PT Boats", 
        "All Subs",
        "Multishot", 
        "Nukes", 
        "Mines"
        };

    
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
        int i;
        
        System.out.println();
        displaySettingsBorder();
        System.out.println("Available Gamemodes for Battleship: \n");
        for (i=0; i<availableGamemodes.length; i++){
                   System.out.println(availableGamemodes[i] + "\n");
        }
        displaySettingsBorder();
        
    }
    
    public void gameCount(){ //lesson 6 individual assignment
        int total = 0;
        int count [] = {3,5,63,13,20,15,16,30};
            for (int i=0; i < count.length; i++){
            total += count[i];
            System.out.println("Total games played by player is: " + total);
    }
        
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
