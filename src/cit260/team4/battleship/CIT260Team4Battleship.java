/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

import java.util.Scanner;
import java.awt.Color; 

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
        //game.mainMenuInput();
        game.displayMain();

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
        MainMenuView menu= new MainMenuView();//instance creation for MainMenuView class

 public void displayMain(){
              MainMenuView mainMenu = new MainMenuView();
        mainMenu.mainMenuInput();
 }
    
        private final static String [][] mainMenuItems = {//sets up the Main MainMenuView Choices after putting name in. 
        {"A", "AI Turn"},
        {"B", "Browse Ships"},    
        {"G", "Play Game"},
        {"D", "Decorated Veterans"},
        {"S", "Settings"},
        {"H", "Help Menu"},
        {"X", "Exit"}
    };
    
    
    private final AI AI = new AI();                                 //calls the AI class. 
    private final Ships Ships = new Ships();                        //calls the Ships class. 
    private final ShipMenu shipMenu = new ShipMenu();
    private final Gameplay Gameplay = new Gameplay();               //calls the Gameplay class. 
    private final ScoreBoard ScoreBoard = new ScoreBoard();         //calls the ScoreBoard class. 
    private final Settings Settings = new Settings();               //calls the Settings class. 
    private final HelpMenuView HelpMenuView = new HelpMenuView();   //calls the HelpMenuView class. 
    
    public CIT260Team4Battleship(){
        
    }
    
    public void mainMenuInput(){ //runs the corresponding letter choices listed in the String choices above.
        
            String command;
            Scanner inFile = new Scanner(System.in);
            
            do{
                this.display();
                
                command = inFile.nextLine();
                command = command.trim().toUpperCase(); //changes input to always be uppercase, in case someone inputs a lowercase letter. 
                
                switch (command){
                    case "A":
                        this.AI.aiTurn(); //calls the aiTurn function from the AI class.
                        break;
                    case "B":
                       this.Ships.shipInput();
                        //shipMenu.ShipMenu();
                       //this.Ships.showName();  //calls the showName function from the Ships class.
                       // this.Ships.showSize();  //calls the showSize function from the Ships class.
                       // this.Ships.getAccuracy(5, 10);  //calls the getAccuracy function from the Ships class.
                        break;
                    case "G":
                        this.Gameplay.hitOrMiss(); //calls the hitOrMiss function from the Gameplay class.
                        this.Gameplay.gameExit(); //calls the gameExit function from the Gameplay class.
                        break;
                    case "D":
                        this.ScoreBoard.showHighScore(); //calls the showHighScore function from the ScoreBoard class.
                        this.ScoreBoard.scoreStats(); //calls the showStats function from the ScoreBoard class.
                        break; 
                    case "S":
                        this.Settings.selectDifficulty(); //calls the selectDifficulty function from the Settings class.
                        break;
                    case ("H"):
                        this.HelpMenuView.helpInput(); //calls the helpInput function from the HelpMenuView class.
                        break;
                    case "X":  //breaks from the options menu. 
                        break;
                    default:
                        System.out.println("Invalid Choice. Please select another option.");  //pints out an error when one of the above listed options is not selected. 
                        continue;
                }
            } 
            while (!command.equals("X")); //continues to run the main menu until X is selected to end it. 
                return;
    }
        
    public final void display (){
        System.out.println("\n\t************************************************************"); //decoration. 
        System.out.println("\tEnter the letter for your selection from the help menu:"); //simple output message. 
        
        for (int i = 0; i < CIT260Team4Battleship.mainMenuItems.length; i++){
            System.out.println("\t  " + mainMenuItems[i][0] + "\t" + mainMenuItems[i][1]);
        }
        System.out.println("\t************************************************************\n");
    }

}

