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
public class Die {

    private int sides;
    private int value;

    public Die(int sides) {
        this.sides = sides;
    }

    public void throwDie() {
        value = (int) (Math.random() * sides) + 1;
    }
    
    public int getDie(){
        return value;
    }
}
