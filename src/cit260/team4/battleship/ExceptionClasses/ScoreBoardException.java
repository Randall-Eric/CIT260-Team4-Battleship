/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.ExceptionClasses;

import cit260.team4.battleship.ScoreBoard;

/**
 *
 * @author Jordan
 */
public class ScoreBoardException {
    
   public void scoreexception(String args[]) {
    try {
        ScoreBoard.scoreStats(); 
    }

    catch (Throwable ex){
    System.out.println("Unexpectd Errors");
    }

    finally{
       System.exit(1);
    }
    } 
    
    
    
}
