package cit260.team4.battleship;

import cit260.team4.battleship.cit260group4BattleshipMenus.MainMenuView;
import java.util.Scanner;
import cit260.team4.battleship.MainGUI;  

/**
 *
 * @author erandall
 */
public class CIT260Team4Battleship{

    
    String firstName;//enter player first name
    String description = "This is the battleship game. Enjoy!!";// a description of the game
    
    public static void main(String[] args) {
        
       CIT260Team4Battleship game = new CIT260Team4Battleship(); // constructor - creates instance of class called "game"
        game.getName(); //calls the getName() method for the "game" instance of the class
        game.displayHelp(); //calls the getName() method for the "name" instance of the class
        game.menuItems();

    }
        
        private void getName(){
            Scanner input = new Scanner(System.in);   // gets input using scanner and puts it into variable firstName
            System.out.println("What is your name?");
            this.firstName = input.next();
        }
        public void displayHelp() {
            System.out.println("Welcome, " + this.firstName + "!"); //displays welcome message and description
            System.out.println(this.description);
            
        }        
        
        private final MainMenuView MainMenuView = new MainMenuView();
        public void menuItems () {
            this.MainMenuView.getInput(null);
            
        }
        
}

/**
        private final static String [][] mainMenuItems = {//sets up the Main MainMenuView Choices after putting name in. 
        //{"A", "AI Turn"},
        {"BS", "Browse Ships"},    
        {"D", "Decorated Veterans"},
        {"M", "Main Menu Options"},
        {"P", "Play Game"},
        {"S", "Settings"},
        {"H", "Help Menu"},
        {"X", "Exit"}
    };
    
    
    //private final AI AI = new AI();                                 //calls the AI class. 
    private final Ships Ships = new Ships();                        //calls the Ships class. 
    private final ShipMenu shipMenu = new ShipMenu();
    private final Gameplay Gameplay = new Gameplay();               //calls the Gameplay class. 
    private final ScoreBoard ScoreBoard = new ScoreBoard();         //calls the ScoreBoard class. 
    private final ScoreBoardMenuView ScoreBoardMenuView = new ScoreBoardMenuView(); //calls the ScoreBoardMenuView class.
    private final SettingsMenuView settingsMenuView = new SettingsMenuView();               //calls the Settings Menu class. 
    private final HelpMenuView HelpMenuView = new HelpMenuView();   //calls the HelpMenuView class. 
    private final ShipPlacement shipPlacement = new ShipPlacement();
    private final MainMenuView MainMenuView = new MainMenuView();
    
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
                   // case "A":
                   //     this.AI.aiTurn(); //calls the aiTurn function from the AI class.
                   //     break;
                    case "BS":
                       this.Ships.shipList();
                        //this.Ships.shipInput();
                        //shipMenu.ShipMenu();
                       //this.Ships.showName();  //calls the showName function from the Ships class.
                       // this.Ships.showSize();  //calls the showSize function from the Ships class.
                       // this.Ships.getAccuracy(5, 10);  //calls the getAccuracy function from the Ships class.
                        break;
                    case "D":
                        this.ScoreBoardMenuView.scoreBoardMenuInput();
                        this.ScoreBoard.showHighScore(); //calls the showHighScore function from the ScoreBoard class.
                        this.ScoreBoard.scoreStats(); //calls the showStats function from the ScoreBoard class.
                        break;
                    case "M":
                        this.MainMenuView.mainMenuInput();
                        break;
                    case "P":
                        this.Gameplay.playerNames(); 
                        this.shipPlacement.shipPlacement();
                        this.Gameplay.hitOrMiss(); //calls the hitOrMiss function from the Gameplay class.
                        this.Gameplay.gameExit(); //calls the gameExit function from the Gameplay class.
                        break;    
                    case "S":
                        this.settingsMenuView.settingsInput(); //calls the SettingsMenuView class
                        break;
                    case ("H"):
                        this.HelpMenuView.helpInput(); //calls the helpInput function from the HelpMenuView class.
                        break;
                    case "X":  //breaks from the options menu. 
                        break;
                    default:
                        System.out.println("Invalid Choice. Please select another option.");  //pints out an error when one of the above listed options is not selected. 
                }
            } 
            while (!command.equals("X")); //continues to run the main menu until X is selected to end it. 
    }
        
    public final void display (){
        System.out.println("\n\t************************************************************"); //decoration. 
        System.out.println("\tEnter the letter for your selection from the main menu:"); //simple output message. 
        for (String[] mainMenuItem : CIT260Team4Battleship.mainMenuItems) {
            System.out.println("\t  " + mainMenuItem[0] + "\t" + mainMenuItem[1]);
        }
        System.out.println("\t************************************************************\n");
    }
*/

            

