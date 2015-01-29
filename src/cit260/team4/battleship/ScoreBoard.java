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
    int newTotalScore = 0;
    
    
    public void showHighScore(){
        System.out.println("Your high score is: " + highscore);
}
   
      
        public void addHitScore(){
   
                newTotalScore = hitPoint + highscore;
                if (newTotalScore < 0){
                	System.out.println("Your score is 0.");
                if (newTotalScore == 0){
                	System.out.println("Your score is 0.");
                if (newTotalScore > 1){
                	System.out.println("/t Plus " + hitPoint + " Points. /n Your new high score is "+ newTotalScore);	
                
          	    }
                }
                }
	}
    
}

