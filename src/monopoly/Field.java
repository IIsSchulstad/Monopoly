/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author sjoeh
 */
public class Field {

    private String name;
    private int number;

    public Field(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    public int getNumber(){
        return number;
    }
    
    public String toString(){
        String stringBuilder = "You have landed on " + name + " (Field number: " + number + ")";
        return stringBuilder;
    }
}
