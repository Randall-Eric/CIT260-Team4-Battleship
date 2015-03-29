/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.ExceptionClasses;

import cit260.team4.battleship.GameStatus;

/**
 *
 * @author taylorwestmorland
 */
public class GameStatusException {
    public void gameexception(String args[]) {
    try {
         GameStatus.spacesLeft();
    }

    catch (Throwable ex){
    System.out.println("Unexpected Miss count.");
    }

    finally{
       System.exit(1);
    }
}
}
