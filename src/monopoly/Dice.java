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
public class Dice {

    private Die die1;
    private Die die2;

    public Dice() {
        die1 = new Die(6);
        die2 = new Die(6);
    }
    
    public int throwDice(){
        die1.throwDie();
        die2.throwDie();
        return die1.getDie() + die2.getDie();
    }
    
    public boolean getPair(){
        if(die1.getDie()==die2.getDie()){
            return true;
        }
        return false;
    }
}
