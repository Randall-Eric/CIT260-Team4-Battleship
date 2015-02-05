/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

import java.util.Scanner;

/**
 *
 * @author erandall
 */
public class CIT260Team4Battleship {
           
    String firstName;//enter player first name
    String description = "This is the battleship game. Enjoy!!";// a description of the game
      
       
    public static void main(String[] args) {
        CIT260Team4Battleship game = new CIT260Team4Battleship(); // constructor - creates instance of class called "game"
        game.getName(); //calls the getName() method for the "game" instance of the class
        game.displayHelp(); //calls the getName() method for the "name" instance of the class
        game.mainMenuInput();

    }
        
        public void getName(){
            Scanner input = new Scanner(System.in);   // gets input using scanner and puts it into variable firstName
            System.out.println("What is your name?");
            this.firstName = input.next();
        }
        public void displayHelp() {
            System.out.println("Welcome, " + this.firstName + "!"); //displays welcome message and description
            System.out.println(this.description);
        }
        public void startGame(){
            
        }
        public void playerMove(){
            
        }
        Menu menu= new Menu();//instance creation for Menu class


    
        private final static String [][] mainMenuItems = {
        {"A", "AI Turn"},
        {"B", "Browse Ships"},    
        {"G", "Play Game"},
        {"D", "Decorated Veterans"},
        {"S", "Settings"},
        {"H", "Help Menu"},
        {"X", "Exit"}
    };
    
    
    private final AI AI = new AI(); 
    private final Ships Ships = new Ships(); 
    private final Gameplay Gameplay = new Gameplay(); 
    private final ScoreBoard ScoreBoard = new ScoreBoard();
    private final Settings Settings = new Settings();
    private final HelpMenuView HelpMenuView = new HelpMenuView();
    
    public CIT260Team4Battleship(){
        
    }
    
    public void mainMenuInput(){
        
            String command;
            Scanner inFile = new Scanner(System.in);
            
            do{
                this.display();
                
                command = inFile.nextLine();
                command = command.trim().toUpperCase();
                
                switch (command){
                    case "A":
                        this.AI.aiTurn();
                        break;
                    case "B":
                        this.Ships.showName();
                        this.Ships.showSize();
                        this.Ships.getAccuracy(5, 10);
                        break;
                    case "G":
                        this.Gameplay.hitOrMiss();
                        break;
                    case "D":
                        this.ScoreBoard.showHighScore();
                        break; 
                    case "S":
                        this.Settings.selectDifficulty();
                        break;
                    case ("H"):
                        this.HelpMenuView.helpInput();
                        break;
                    case "X":
                        break;
                    default:
                        System.out.println("Invalid Choice. Please select another option.");
                        continue;
                }
            } 
            while (!command.equals("X"));
                return;
    }
        
    public final void display (){
        System.out.println("\n\t************************************************************");
        System.out.println("\tEnter the letter for your selection from the help menu:");
        
        for (int i = 0; i < CIT260Team4Battleship.mainMenuItems.length; i++){
            System.out.println("\t  " + mainMenuItems[i][0] + "\t" + mainMenuItems[i][1]);
        }
        System.out.println("\t************************************************************\n");
    }

}

