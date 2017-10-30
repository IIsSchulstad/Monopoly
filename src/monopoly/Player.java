/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sjoeh
 */
public class Player {

    private String name;
    private FieldInterface field;
    private List<OwnebleField> ownsList;
    private int money;

    public Player(String name, FieldInterface startField) {
        this.name = name;
        field = startField;
        ownsList = new ArrayList<>();
        money = MonopolyConstants.START_MONEY;
    }

    public String getName() {
        return name;
    }

    public void move(Dice dice) {
        int steps = dice.throwDice();
        System.out.println(name + " rolled " + steps);
        this.field = Game.fields[field.getNumber() + steps - 1];
        System.out.println(field.getName());
        field.consequense(this);
    }

    public void setPos(int pos) {
        field = Game.fields[pos];
    }

    public FieldInterface getField() {
        return field;
    }

    public int getMoney() {
        return money;
    }

    public void buy(OwnebleField owneble) {
        if (pay(owneble.getPrice())) {
            owneble.setOwner(this);
            ownsList.add(owneble);
            System.out.println("You bought " + owneble.getName());
        }
    }

    public boolean pay(int amount) {
        if (money >= amount) {
            money -= amount;
            return true;
        }
        return false;
    }
}
