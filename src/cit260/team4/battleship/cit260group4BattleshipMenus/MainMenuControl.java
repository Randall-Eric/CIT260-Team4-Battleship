/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.cit260group4BattleshipMenus;

/**
 *
 * @author thayne66
 */
public class MainMenuControl {
      public void welcome(){
          System.out.println("Welcome to Battleship");
                  }  
  private void thankYou(){
          System.out.println("Thank you for playing Battleship");
                  }
  private void startNewGame(){
      System.out.println("Let the game begin!");
  }
  private void displayHelp(){
              HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.helpInput();
  }
}
