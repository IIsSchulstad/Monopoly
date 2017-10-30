package monopoly;

import java.util.Scanner;

/**
 *
 * @author erso
 */
public abstract class OwnableField implements FieldInterface {

    private String name;
    private int number;
    private int price;
    private Player owner = null;

    protected OwnableField(String name, int number, int price) {
        this.name = name;
        this.number = number;
        this.price = price;
    }

    //@Override
    public String getName() {
        return name;
    }

    //@Override
    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "OwnebleField{" + "name=" + name + ", number=" + number
                + ", price=" + price + ", owner=" + owner + '}';
    }

    public void consequense(Player poorPlayer) {
        if (this.owner == poorPlayer) {
            System.out.println("You already own this " + this.name);
            return;
        } else if (this.owner == null) {
            System.out.println("You currently have " + poorPlayer.getMoney() + "$");
            System.out.println("Do you wish to buy this field (" + this.name + ")?");
            System.out.println("This will put you at " + (poorPlayer.getMoney() - price) + "$");
            if (Math.random() > 0.5) {
                poorPlayer.buy(this);
            }
            return;
        }
    }
}
