/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

import java.util.Random;
/**
 *
 * @author MatthewSweeney
 */
public class AI {
    float turns=25;
    int aiTurnRow;
    String aiTurnColumn;
    int newRow;
    String turnPhrase;
    
    private int aiTurnRow() {
        Random randRow = new Random();
        aiTurnRow = randRow.nextInt((10 - 1) + 1) + 1;
        return aiTurnRow;
    }
    
    private String aiTurnColumn(){
        String[] columns = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"
        };
        int columnNumber = aiTurnRow();
        aiTurnColumn = columns[columnNumber];
        return aiTurnColumn;
    }
    
    private void aiTurn(){
        //aiTurnRow = aiTurnRow();
        aiTurnColumn = aiTurnColumn();
        
        if ((aiTurnRow < 10) || (aiTurnRow == 0)){
            newRow = aiTurnRow + 1;
        }
        else{
            newRow = 1;        
        }
        turns--;
        int newturns = (int)(turns);
        turnPhrase = "Computer has " + newturns + " turns left. \n Last turn Computer chose column " + aiTurnColumn + " and row " + aiTurnRow + ". \n This turn computer chooses column " + aiTurnColumn + " and row " + newRow;
    }
}
