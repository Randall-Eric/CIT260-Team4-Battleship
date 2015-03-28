/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.ExceptionClasses;
import cit260.team4.battleship.ships.ShipPlacement;

/**
 *
 * @author dbanks
 */
public class MenuException {

public void placeOccupied (String args[]) {
    try {
        ShipPlacement.shipPlacement(); 
    }
    
    catch (ArrayIndexOutOfBoundsException exc) {
        System.out.println("\nSelection already taken by other ship.\n");
    }
    finally {
        System.exit(1);
    }

  }
    
    public static void shipPlacement () {
    try {
        ShipPlacement.shipPlacement(); 
    }
    
    catch (ArrayIndexOutOfBoundsException exc) {
        System.out.println("Out of Bounds!");
    }
    finally {
        System.exit(1);
    }

  }



}