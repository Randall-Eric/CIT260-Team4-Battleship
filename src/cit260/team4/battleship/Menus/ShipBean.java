/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship.Menus;

import java.io.Serializable;

/**
 *
 * @author christianray
 */
public class ShipBean implements Serializable {
    private int length;
    private String type;
    private int value;
    
 public ShipBean(){}
  
  private String getType(){
        return this.type;
  }
  private int getLength(){
        return this.length;
  }
  private int getValue(){
        return this.value;
  }
private void setType(String type){
        this.type=type;
}
private void setLength(int length){
        this.length=length;
}
private void setValue(int value){
        this.value=value;
}
}
