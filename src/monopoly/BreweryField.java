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
public class BreweryField extends OwnableField{
    
    public BreweryField(String name, int number, int price) {
        super(name, number, price);
    }

    @Override
    public String toString() {
        String s = "Brewery Field:\n";
        s += super.toString();
        return s; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
