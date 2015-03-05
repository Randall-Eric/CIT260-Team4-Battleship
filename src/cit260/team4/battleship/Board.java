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
        private Board (){
            for (int j=0; j<board.length; j++) {
                for (int c=0; c<board[j].length; c++) {
                    board[j][c]=0;
                }
            }
     
        }
        private void displayGameboard() {
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
        private void clearTheBoard(){
            
            for(i = 0; i<this.gameboard.length; i++){
                System.out.println("The Board has been cleared");
                    
                }
            }
        }




/*public class Board {
    String gameboard[] = {
            "A1, B1, C1, D1, E1, F1, G1, H1, I1, J1",
            "A2, B2, C2, D2, E2, F2, G2, H2, I2, J2",
            "A3, B3, C3, D3, E3, F3, G3, H3, I3, J3",
            "A4, B4, C4, D4, E4, F4, G4, H4, I4, J4",
            "A5, B5, C5, D5, E5, F5, G5, H5, I5, J5",
            "A6, B6, C6, D6, E6, F6, G6, H6, I6, J6",
            "A7, B7, C7, D7, E7, F7, G7, H7, I7, J7",
            "A8, B8, C8, D8, E8, F8, G8, H8, I8, J8",
            "A9, B9, C9, D9, E9, F9, G9, H9, I9, J9",
            "A10, B10, C10, D10, E10, F10, G10, H10, I10, J10",            
        };
        int i;
        public void displayGameboard() {
            for (i = 0; i <10; i++) {
               System.out.print(gameboard[i] + ",\n ");
          }
        }
}*/
