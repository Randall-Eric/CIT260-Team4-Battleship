/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

/**
 *
 * @author Jordan Smith
 */
public class ScoreBoard {
    int highscore = 155;
     
    
    
    
    public void showHighScore(){
        System.out.println("The high score for this game is: " + highscore);
}
   
      
        
    
    public void addHitScore (){
        int sum = 0, hitPoint = 5, userhighscore = 145, totalPointsPossible = 0;
        int ships;
        float s;
        ships = 5;
        s = ships;
 
        
        totalPointsPossible = ships * hitPoint;
        sum = hitPoint + userhighscore;
 
        System.out.println("You made a hit! \n Plus " + hitPoint + " points! Your new total score is " + sum + " There are " + totalPointsPossible + " points possible on in this game.");
    
        if (highscore < sum ){
            System.out.println("Congrats on the new High Score!");
        }
        else{
            System.out.println("\b You haven't broken the High Score yet!");
    }
}
}
