/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.ExceptionClasses;

/**
 *
 * @author dbanks
 */
public class MenuException {

    public void main (){
    
try {
    
    System.out.println("Before exception is generated.");
    
    System.out.println("this won't be displayed"); 
}
catch (Exception exe){
    
    System.out.println("Index out-of-bounds!");

    System.out.println ("After catch statement."); 
  }
 }
}
