/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;
import java.util.Scanner;
/**
 *
 * @author rebecca thayne
 */
public class MainMenuView {
 private final static String [][] menuItems = {
        {"N", "New Game"},
        {"H", "Help Menu"},
        {"X", "Exit"}
    };
    
    private MainMenuControl mainMenuControl = new MainMenuControl();

public void mainMenuInput(){  
  Scanner inFile = new Scanner(System.in);
  String command;
do{
    this.display();
                command = inFile.nextLine();
                command = command.trim().toUpperCase();
                
                switch (command){
                    case "N":
                        this.mainMenuControl.startNewGame();
                        break;
                    case "H":
                        this.mainMenuControl.displayHelp();
                        break;
                    case "X":
                        break;
                    default:
                        System.out.println("Invalid Choice. Please select another option.");
                        continue;
} 
} while (!command.equals("X"));
return;
}
public final void display (){
        System.out.println("\n\t************************************************************");
        System.out.println("\tEnter the letter for your selection from the main menu:");
        
        for (int i = 0; i < MainMenuView.menuItems.length; i++){
            System.out.println("\t  " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t************************************************************\n");
}
}
