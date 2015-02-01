/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

/**
 *
 * @author christianray
 */
public class Ships {
    int size=4;
    String name="Battleship";  
    
  
    
    public void showSize(){
        System.out.println("The ship's size is: " + size);
}
    public void showName(){
        System.out.println("The ship's name is: " + name);
    }
    public void getAccuracy(int hits, int shots){
        
        double dShots = (double) shots;
        double dHits = (double) hits;
        double accuracy =0;
        
        if (shots == 0) 
            System.out.println("\tThe Player\'s accuracy is Zero");
        else if(shots < hits)
            System.out.println("\tInvalid Input");
        else {
            accuracy = (dHits/dShots)*100;
            System.out.println("\tThe Player\'s accuracy is " + accuracy + "%");
        }
    }
}
