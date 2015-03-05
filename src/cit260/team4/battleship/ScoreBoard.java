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
    public static int highscore = 155;
    public static int nums [] = { 100, 45, 67, - 3, 20 }; 
    public static int size;
    
    public void lessonSixArray () {
                    
        int a, b, t; 
        size = 5;
        
        System.out.print ("Original array: ");
        for (int i=0; i < size; i++)
            System.out.print(" ," + nums [i]);
        System.out.println();
        
        for (a=1; a < size; a++)
            for(b=size-1; b >= a; b--){
                if (nums[b-1] > nums[b])  {
                    t = nums[b-1]; 
                    nums [b-1] = nums[b];
                    nums[b] = t;
                }
            }
    }
    public void lessonSixArrayPrnt () {
        System.out.print ("Sorted array is: ");
        for (int i=0; i < size; i++)
            System.out.print(" " + nums [i]); 
        System.out.println(); 
    }
    
    
    public void lessonSixindividual () {
        int sum = 0;
        int scores [] = {5,24,4,68,213,55,73,106,403,20,46};
        int max = scores [0];
        for(int x : scores){
            System.out.println("Each Score is: " + x);
            max = Math.max(x,max);
        }
        System.out.println("Maximum Value: " + max);
    }
    
    
    
    
    
    public void showHighScore(){
        System.out.println("The high score for this game is: " + highscore);
}
   
      
        
    
    public void scoreStats (){
        int sum = 0, hitPoint = 5, userhighscore = 125, totalPointsPossible = 0;
        int ships;
        float s;
        ships = 5;
        s = ships;
 
        
        totalPointsPossible = ships * hitPoint;
        sum = hitPoint + userhighscore;
 
        System.out.println("You made a hit! \n Plus " + hitPoint + " points! Your new total score is " + sum + " There are " + totalPointsPossible + " points possible on in this game.");
    
        if (highscore < sum ){
            highscore = sum;
            System.out.println("Congrats on the new High Score of " + highscore);
        }
        else{
            System.out.println("\b You haven't broken the High Score of " + highscore + " yet!");
    }
}
}
