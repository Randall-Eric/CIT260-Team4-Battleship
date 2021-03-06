/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.cit260group4BattleshipMenus;
import cit260.team4.battleship.creatorinfo.AuthorCreditView;
import cit260.team4.battleship.Gameplay;
import cit260.team4.battleship.ScoreBoard;
import cit260.team4.battleship.ships.ShipPlacement;
import java.util.Scanner;
import cit260.team4.battleship.interfaces.EnterInfo;
import cit260.team4.battleship.ExceptionClasses.MenuException;
import cit260.team4.battleship.MainGUI; 
/**
 *
 * @author rebecca thayne
 */
public class MainMenuView extends MenuSuperClass implements EnterInfo{

    private final static String [][] menuItems = {//sets up the Main MainMenuView Choices after putting name in. 
        //{"A", "AI Turn"},        
        {"BS", "Browse Ships"},
        {"C", "Code Developers"},
        {"D", "Decorated Veterans"},
        {"M", "Main Menu Options"},
        {"P", "Play Game"},
        {"S", "Settings"},
        {"H", "Help Menu"},
        {"X", "Exit"}
    };
    
    
    //private final AI AI = new AI();                                 //calls the AI class. 
   // private final Ships Ships = new Ships();                        //calls the Ships class. 
    private final ShipMenu shipMenu = new ShipMenu();
    private final Gameplay Gameplay = new Gameplay();               //calls the Gameplay class. 
    private final ScoreBoard ScoreBoard = new ScoreBoard();         //calls the ScoreBoard class. 
    private final ScoreBoardMenuView ScoreBoardMenuView = new ScoreBoardMenuView(); //calls the ScoreBoardMenuView class.
    private final SettingsMenuView settingsMenuView = new SettingsMenuView();               //calls the Settings Menu class. 
    private final HelpMenuView HelpMenuView = new HelpMenuView();   //calls the HelpMenuView class. 
    private final ShipPlacement shipPlacement = new ShipPlacement();
    private final AuthorCreditView AuthorCreditView = new AuthorCreditView(); 
    private final ShipBean bean = new ShipBean();
    private final MenuException MenuException = new MenuException(); 
    private final MainGUI MainClass = new MainGUI(); 
    
    public MainMenuView(){
        super(MainMenuView.menuItems);
    }
    
 
    @Override
    public String getInput(Object object){ //runs the corresponding letter choices listed in the String choices above.
        
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
                       //this.Ships.shipList();
                       //this.Ships.shipInput();
                       //this.shipMenu.ShipMenu();
                       //this.Ships.showName();  //calls the showName function from the Ships class.
                       //this.Ships.showSize();  //calls the showSize function from the Ships class.
                       //this.Ships.getAccuracy(5, 10);  //calls the getAccuracy function from the Ships class.
                       //this.Ships.shipAvg();
                        
                        break;
                    case "C":
                        this.AuthorCreditView.authorInput();
                        break;
                    case "D":
                        this.ScoreBoardMenuView.getInput(null);
                        this.ScoreBoard.showHighScore(); //calls the showHighScore function from the ScoreBoard class.
                        this.ScoreBoard.scoreStats(); //calls the showStats function from the ScoreBoard class.
                        break;
                    case "P":
                        this.Gameplay.playerNames(); 
                        ShipPlacement.shipPlacement();
                        this.Gameplay.playGame(); //calls the hitOrMiss function from the Gameplay class.
                        this.Gameplay.gameExit(); //calls the gameExit function from the Gameplay class.
                        break;    
                    case "S":
                        this.settingsMenuView.settingsInput(); //calls the SettingsMenuView class
                        break;
                    case ("H"):
                        this.HelpMenuView.getInput(null); //calls the helpInput function from the HelpMenuView class.
                        break;
                    case "X":  //breaks from the options menu. 
                        break;
                    default:
                        System.out.println("Invalid Selection!");  //pints out an error when one of the above listed options is not selected. 
                }
            } 
            while (!command.equals("X")); //continues to run the main menu until X is selected to end it. 
    return command;
    }
        
    
}
  
    
/**    
    private final static String [][] menuItems = {
        {"N", "New Game"},
        {"H", "Help Menu"},
        {"B", "View Board"},
        {"X", "Exit"}
    };
    
    private MainMenuControl mainMenuControl = new MainMenuControl();
    private Board Board= new Board();
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
                    case "B":
                        this.Board.displayGameboard();
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
*/
