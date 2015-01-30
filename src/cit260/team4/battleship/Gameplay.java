/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

import java.util.Scanner;

/**
 *
 * @author dbanks
 */
public class Gameplay {
    String returnOutput;
    String column;
    float rowFloat;
    String shipColumn = "A";
    int shipRow = 1; //will be an array?
    
    public boolean hitOrMiss() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the column: ");
        column = input.next();
        System.out.println("Enter the row: ");
        rowFloat = input.nextFloat();
        int row = (int)rowFloat;
        
        
        if (column.equals("A") || column.equals("B") || column.equals("C") || column.equals("D") || column.equals("E") 
            || column.equals("F") || column.equals("G") || column.equals("H") || column.equals("I") ||column.equals("J")){
        //inside bounds
            if (row <=10 && row >= 1){
                if(column.equals(shipColumn) && row == shipRow){
                    returnOutput = "Hit!";
                    return true;
                }
            
            else 
                returnOutput = "Miss!";
                return false;
            }
        }
        else
            returnOutput="Invalid Input";
            System.out.println("\t Invalid \n Input");
        return false;
            }
    
}

