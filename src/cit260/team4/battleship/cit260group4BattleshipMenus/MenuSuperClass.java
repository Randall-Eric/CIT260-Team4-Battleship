/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.cit260group4BattleshipMenus;
import java.util.Scanner;
/**
 *
 * @author taylorwestmorland
 */
public class MenuSuperClass {
    
    private String [][] menuItems=null;
    
    public MenuSuperClass(){
    }
    
    public MenuSuperClass(String[][] menuItems){
        this();
        this.menuItems= menuItems;
    }
    protected final void display() {
        System.out.println("\n\t************************************************************");
        System.out.println("\tEnter the letter for your selection from the following commands:");
        
        for (int i=0; i<this.menuItems.length; i++) {
            System.out.println("\t  " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t************************************************************\n");
}
    
    protected final String getCommand() {
        Scanner inFile = new Scanner(System.in);
        String command;
          
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
        return command;
     
}
}