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
public class Player {

    private String name;
    private Field currentField;
    private int pos;

    public Player(String name, Field startField) {
        this.name = name;
        pos = 0;
        currentField = startField;
    }
    
    public String getName(){
        return name;
    }

    public void move(Dice die) {
        pos += die.throwDice();
        currentField = Game.fields.get(pos);
        System.out.println(currentField.toString());
    }

    public Field getField() {
        return currentField;
    }
}
