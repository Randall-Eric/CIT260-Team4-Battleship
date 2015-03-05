/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.team4.battleship;

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
  
  public String getType(){
        return this.type;
  }
  public int getLength(){
        return this.length;
  }
  public int getValue(){
        return this.value;
  }
public void setType(String type){
        this.type=type;
}
public void setLength(int length){
        this.length=length;
}
public void setValue(int value){
        this.value=value;
}
}
