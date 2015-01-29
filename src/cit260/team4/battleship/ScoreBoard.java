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
    int hitPoint = 5; 
    int newTotalScore;
  
    
    public void showHighScore(){
        System.out.println("Your high score is: " + highscore);
}
   
    public void addHitScore(){
   
                newTotalScore = hitPoint + highscore;
                System.out.println("Plus " + hitPoint + " Points. Your new high score is "+ highscore);
                }
           
           }
    
    