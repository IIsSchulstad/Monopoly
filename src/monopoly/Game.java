/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sjoeh
 */
public class Game {

    public static ArrayList<Field> fields;
    private ArrayList<Player> players;
    private Dice die;
    private Scanner input = new Scanner(System.in);
    private boolean isRunning;

    public Game() {
        fields = new ArrayList<Field>();
        players = new ArrayList<Player>();
        createFields();
        createDice();
        System.out.println("How many will be playing?");
        int amountOfPlayers = Integer.parseInt(input.nextLine());
        createPlayers(amountOfPlayers);

        isRunning = true;
        int currentPlayer = 0;
        System.out.println(players.size());
        while (isRunning) {
            players.get(currentPlayer).move(die);
            if (players.get(currentPlayer).getField().getNumber() > 12) {
                isRunning = false;
            }
            if (currentPlayer >= (players.size()-1)) {
                currentPlayer = 0;
            } else {
                currentPlayer++;
            }
        }
        System.out.println(players.get(currentPlayer - 1).getName() + " have won!");
    }

    private void createFields() {
        fields.add(new Field("Jail", 1));
        fields.add(new Field("Church", 2));
        fields.add(new Field("a very nice place", 3));
        fields.add(new Field("Jail", 4));
        fields.add(new Field("Church", 5));
        fields.add(new Field("a very nice place", 6));
        fields.add(new Field("Jail", 7));
        fields.add(new Field("Church", 8));
        fields.add(new Field("a very nice place", 9));
        fields.add(new Field("Church", 10));
        fields.add(new Field("a very nice place", 11));
        fields.add(new Field("Jail", 12));
        fields.add(new Field("Church", 13));
        fields.add(new Field("a very nice place", 14));
        fields.add(new Field("Jail", 15));
        fields.add(new Field("Church", 16));
        fields.add(new Field("a very nice place", 17));
        fields.add(new Field("Jail", 1));
        fields.add(new Field("Church", 2));
        fields.add(new Field("a very nice place", 3));
        fields.add(new Field("Jail", 4));
        fields.add(new Field("Church", 5));
        fields.add(new Field("a very nice place", 6));
        fields.add(new Field("Jail", 7));
        fields.add(new Field("Church", 8));
        fields.add(new Field("a very nice place", 9));
        fields.add(new Field("Church", 10));
        fields.add(new Field("a very nice place", 11));
        fields.add(new Field("Jail", 12));
        fields.add(new Field("Church", 13));
        fields.add(new Field("a very nice place", 14));
        fields.add(new Field("Jail", 15));
        fields.add(new Field("Church", 16));
        fields.add(new Field("a very nice place", 17));
        fields.add(new Field("Jail", 1));
        fields.add(new Field("Church", 2));
        fields.add(new Field("a very nice place", 3));
        fields.add(new Field("Jail", 4));
        fields.add(new Field("Church", 5));
        fields.add(new Field("a very nice place", 6));
        fields.add(new Field("Jail", 7));
        fields.add(new Field("Church", 8));
        fields.add(new Field("a very nice place", 9));
        fields.add(new Field("Church", 10));
        fields.add(new Field("a very nice place", 11));
        fields.add(new Field("Jail", 12));
        fields.add(new Field("Church", 13));
        fields.add(new Field("a very nice place", 14));
        fields.add(new Field("Jail", 15));
        fields.add(new Field("Church", 16));
        fields.add(new Field("a very nice place", 17));
        fields.add(new Field("Jail", 1));
        fields.add(new Field("Church", 2));
        fields.add(new Field("a very nice place", 3));
        fields.add(new Field("Jail", 4));
        fields.add(new Field("Church", 5));
        fields.add(new Field("a very nice place", 6));
        fields.add(new Field("Jail", 7));
        fields.add(new Field("Church", 8));
        fields.add(new Field("a very nice place", 9));
        fields.add(new Field("Church", 10));
        fields.add(new Field("a very nice place", 11));
        fields.add(new Field("Jail", 12));
        fields.add(new Field("Church", 13));
        fields.add(new Field("a very nice place", 14));
        fields.add(new Field("Jail", 15));
        fields.add(new Field("Church", 16));
        fields.add(new Field("a very nice place", 17));
    }

    private void createDice() {
        die = new Dice();
    }

    private void createPlayers(int numberOfPlayers) {
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Whats the name of player " + (i + 1) + "?");
            players.add(new Player(input.nextLine(), fields.get(0)));
        }
    }
}
