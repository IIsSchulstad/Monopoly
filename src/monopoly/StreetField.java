/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author rasmusstamm
 */
public class StreetField extends OwnableField {

    public StreetField(String name, int number, int price) {
        super(name, number, price);
    }

    @Override
    public String toString() {
        String s = "Street Field:\n";
        s += super.toString();
        return s; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consequense(Player poorPlayer) {
        super.consequense(poorPlayer); //To change body of generated methods, choose Tools | Templates.
        poorPlayer.pay(this.getPrice()/10);
    }

}
