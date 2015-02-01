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
    int hit;
    float userInputFloat;
    int totalSpots= 17;
    int spotsLeft;
    String outPutSpaces;
    
    public void spacesLeft(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many spots did you hit of your oppornet on your last turn?");
        userInputFloat = input.nextFloat();
        int userInput=(int)userInputFloat;
        
        if(userInput>0) {
            hit=hit+1;
            spotsLeft=(int) (totalSpots-hit);
            outPutSpaces="You have "+ spotsLeft + "left to find and hit to WIN!";
            
            if(userInput<=0){
            outPutSpaces="Please move on to your next turn.";    
                
            } 
            else 
                outPutSpaces="Sorry! Invalid Input";
            System.out.println("Sorry!\t Invalid \n Input");
        }
}
}
