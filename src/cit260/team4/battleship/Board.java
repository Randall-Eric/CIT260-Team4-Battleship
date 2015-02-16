/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

/**
 *
 * @author thayne66
 */

// Jordan Smith

public class Board {
  
    String gameboard[] = new String [10];
                 
        int i;
         int[][] board = new int[10][10]; 
        public Board (){
            for (int j=0; j<board.length; j++) {
                for (int c=0; c<board[j].length; c++) {
                    board[j][c]=0;
                }
            }
     
        }
        public void displayGameboard() {
            int k;
            String columns[]={"A","B","C","D","E","F","G","H","I","J"};
            for (int j=0; j<board.length; j++){
                gameboard [j]="";
                for(int c=0; c<board[j].length; c++){
                    k=j+1;
                    gameboard[j]= gameboard[j] + columns[c]+k + ", ";
                }
            }
            for (i = 0; i <10; i++) {
                System.out.print(gameboard[i] + ",\n ");
          }
        }
        public void clearTheBoard(){
            
            for(i = 0; i<this.gameboard.length; i++){
                System.out.println("The Board has been cleared");
                    
                }
            }
        }
