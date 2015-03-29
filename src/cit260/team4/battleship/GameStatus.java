/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

import java.util.Scanner;

/**
 *
 * @author taylorwestmorland
 */
public class GameStatus {
    public static int hit;
    public static float userInputFloat;
    public static int totalSpots= 17;
    public static int spotsLeft;
    public static String outPutSpaces;
    
    public static void spacesLeft(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many spots did you hit of your oppornet on your last turn?");
        userInputFloat = input.nextFloat();
        int userInput=(int)userInputFloat;
        
        if(userInput>0) {
            hit++;
            spotsLeft=(int) (totalSpots-hit);
            outPutSpaces="You have "+ spotsLeft + " spaces left to find and hit to WIN!";
             
                
            } 
            else if(userInput<=0){
            outPutSpaces="Please move on to your next turn."; 
            }
        else 
                outPutSpaces="Sorry! Invalid Input";
            System.out.println("Sorry!\t Invalid \n Input");    
        }

    private void playersHighScore(){
        int nums[]={60,90,100,120,150};
        int max=0;
        
        for(int x:nums){
            if (x>max)
                max=x; 
        }
        
        System.out.println("Your highscore from all of your scores is: "+ max);
        
    }        
    }
