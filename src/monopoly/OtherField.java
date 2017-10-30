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
public class OtherField implements FieldInterface {

    String name;
    int number;

    public OtherField(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        String s = "name=" + name + " number=" + number;
        return s;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consequense(Player poorPlayer) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
