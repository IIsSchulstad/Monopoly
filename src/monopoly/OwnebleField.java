package monopoly;

import java.util.Scanner;

/**
 *
 * @author erso
 */
public abstract class OwnebleField implements FieldInterface {

    private String name;
    private int number;
    private int price;
    private Player owner = null;

    protected OwnebleField(String name, int number, int price) {
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
        } else if (this.owner == null) {
            System.out.println("You currently have " + poorPlayer.getMoney() + "$");
            System.out.println("Do you wish to buy this field (" + this.name + ")?");
            System.out.println("This will put you at " + (poorPlayer.getMoney() - price) + "$");
            if (Math.random() > 0.5) {
                poorPlayer.buy(this);
            }
        } else {
            System.out.println("This " + this.name + " is owned by " + this.owner.getName());
            poorPlayer.pay(this.price / 10);
        }
    }
}
