/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.ships;

import cit260.team4.battleship.cit260group4BattleshipMenus.ShipMenu;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author christianray
 */
public class Ships implements Serializable {
     static int size=4;
    static String name="Battleship"; 
    //String battleship = "You have chosen the Battleship";
    
  private ShipMenu shipmenu = new ShipMenu();
  
  public Ships(){
      for (int i=0; i<this.shipSize.length; i++){
          for (int j=0; j<this.shipLength[i]; j++){
              this.shipSize[i][j]=0;
          }
      }
  
  }
    public int getSize(){
        return this.size;
    }
    public void setSize(){
        this.size=size;
    }
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name=name;
    }
    private void showSize(){
        System.out.println("The ship's size is: " + size);
}
    private void showName(){
        System.out.println("The ship's name is: " + name);
    }
    private void getAccuracy(int hits, int shots){
        
        double dShots = (double) shots;
        double dHits = (double) hits;
        double accuracy =0;
        
        if (shots == 0) 
            System.out.println("\tThe Player\'s accuracy is Zero");
        else if(shots < hits)
            System.out.println("\tInvalid Input");
        else {
            accuracy = (dHits/dShots)*100;
            System.out.println("\tThe Player\'s accuracy is " + accuracy + "%");
        }
    }
    private void shipInput(){
        Scanner input = new Scanner(System.in);
    try{
         int choice;
        
    
             do {
       
        System.out.println("Make your choice: ");
        System.out.println("1. Battleship");
        System.out.println("2. Cruiser");
        System.out.println("3. Aircraft Carrier");
        System.out.println("4. Patrol Boat");
        System.out.println("5. Exit");
        System.out.println("What will you choose?");
        choice = input.nextInt();
             
          
        switch(choice){
            case 1:
                this.shipmenu.showBattleship();
                break;
            case 2:
                this.shipmenu.showCruiser();
                break;
            case 3:
                this.shipmenu.showAircraftCarrier();
                break;
            case 4:
                this.shipmenu.showPatrolBoat();
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                this.shipmenu.showInvalid();
                break;
        }
            
            
        
                
        
        
        } while(choice != 5);}
      catch(InputMismatchException exception){
          System.out.println("\t----------------------------------------");
          System.out.println("\t\t *** INVALID INPUT ****");
          System.out.println("\t    *** PLEASE PUT AN INTEGER 1-5 ***");
          System.out.println("\t----------------------------------------");
      }  
    //return;
    }
    
     private void shipStatus(){
       for(int y = 0; y<this.shipSize.length; y++){
     int sum = 0;
         for(int x: this.shipSize[y]) sum += x;
         if (sum == this.shipSize[y].length){
             System.out.println (this.shipTitles[y] + " is sunk");
         } 
         else System.out.println (this.shipTitles[y] + " is not sunk.");
       }  
   }
    private final int[] shipLength = new int[]{4,2,3,5,4};
    private final int[][] shipSize = new int[5][];
    private final String[] shipTitles = new String[] {"Battleship", "Patrol Boat", "Cruiser", "Aircraft Carrier", "Submarine"};
    private void shipList() {
    String[] nicknames; //= new String[5];
    nicknames = new String[5];
    Scanner input = new Scanner(System.in);
    int i,j;
    for(i = 0; i < this.shipTitles.length; i++) {
            System.out.println("Choose the nickname for your " + this.shipTitles[i] + ":");
            nicknames[i] = input.next();
        }
    for(j = 0; j < this.shipTitles.length; j++)  {  
        System.out.println("Your " + this.shipTitles[j] + "\'s name is " + nicknames[j]+".");
        System.out.println();
        }
    }
    private void shipAvg(){
    double numz[] = new double[5];
    double sum=0;
    double avg;
    int i;
    Scanner in = new Scanner(System.in);
    
    try{
        for(i=0; i < numz.length;i++){
            System.out.println("Enter numer "+ (i+1));
            numz[i]=in.nextInt();
            }
        }
    catch(InputMismatchException exception){
        System.out.println("Put in an integer, please.");
        return;
        }
    for(double x : numz){
        sum += x;
    }
    avg=sum/numz.length;
    
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + avg);
    }
    
    
    
    }

