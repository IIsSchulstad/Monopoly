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
public class ShipField extends OwnableField {

    public ShipField(String name, int number, int price) {
        super(name, number, price);
    }

    @Override
    public String toString() {
        String s = "Ship Field:\n";
        s += super.toString();
        return s;
    }

    @Override
    public void consequense(Player poorPlayer) {
        super.consequense(poorPlayer); //To change body of generated methods, choose Tools | Templates.
        int dept = 500;
        for (int i = 1; i < this.getOwner().getShipFieldCount(); i++) {
            dept = dept * 2;
        }
        poorPlayer.pay(dept);
    }

}
