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
        CIT260Team4Battleship game = new CIT260Team4Battleship(); // constructor - creates instance of class caled "game"
        game.getName(); //calls the getName() method for the "game" instance of the class
        game.displayHelp(); //calls the getName() method for the "name" instance of the class
        
        Ships ship = new Ships(); //instance creation for "Ships" class
        ship.showName(); //calling methods in "Ships" class
        ship.showSize();
        
        ScoreBoard ScoreBoard = new ScoreBoard(); //instance creation for "ScoreBoard" class
        ScoreBoard.showHighScore(); //calling methods in "ScoreBoard" class
        
    }
        public void getName(){
            Scanner input = new Scanner(System.in);   // gets input using scanner and puts it into variable firstName
            System.out.println("What is your name?");
            this.firstName = input.next();
        }
        public void displayHelp() {
            System.out.println("Welcome, " + this.firstName ); //displays welcome message and description
            System.out.println(this.description);
        }
        public void startGame(){
            
        }
        public void playerMove(){
            
        }
    }
    

