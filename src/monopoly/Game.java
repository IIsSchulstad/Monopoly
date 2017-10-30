/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sjoeh
 */
public class Game {

    public static FieldInterface[] fields = new FieldInterface[40];
    private List<Player> players;
    private Dice dice;
    private Scanner input = new Scanner(System.in);
    private boolean isRunning;

    public Game() {
        players = new ArrayList<Player>();
        createFields();
        createDice();
        printFields();
        System.out.println("How many will be playing?");
        int amountOfPlayers = Integer.parseInt(input.nextLine());
        createPlayers(amountOfPlayers);

        isRunning = true;
        int currentPlayer = 0;
        while (isRunning) {
            players.get(currentPlayer).move(dice);
            if (players.get(currentPlayer).getField().getNumber() > 12) {
                isRunning = false;
                break;
            }
            if (currentPlayer >= (players.size() - 1)) {
                currentPlayer = 0;
            } else {
                currentPlayer++;
            }
        }
        System.out.println(players.get(currentPlayer).getName() + " have won!");
    }

    private void createFields() {
        fields[0] = new OtherField(MonopolyConstants.FIELD_NAMES[0], 1);
        fields[1] = new StreetField(MonopolyConstants.FIELD_NAMES[1], 2, 500);
        fields[2] = new OtherField(MonopolyConstants.FIELD_NAMES[2], 3);
        fields[3] = new StreetField(MonopolyConstants.FIELD_NAMES[3], 4, 500);
        fields[4] = new OtherField(MonopolyConstants.FIELD_NAMES[4], 5);
        fields[5] = new StreetField(MonopolyConstants.FIELD_NAMES[5], 6, 500);
        fields[6] = new StreetField(MonopolyConstants.FIELD_NAMES[6], 7, 500);
        fields[7] = new OtherField(MonopolyConstants.FIELD_NAMES[7], 8);
        fields[8] = new StreetField(MonopolyConstants.FIELD_NAMES[8], 9, 500);
        fields[9] = new StreetField(MonopolyConstants.FIELD_NAMES[9], 10, 500);
        fields[10] = new GoToJailField(MonopolyConstants.FIELD_NAMES[10], 11);
        fields[11] = new StreetField(MonopolyConstants.FIELD_NAMES[11], 12, 500);
        fields[12] = new BreweryField(MonopolyConstants.FIELD_NAMES[12], 13, 500);
        fields[13] = new StreetField(MonopolyConstants.FIELD_NAMES[13], 14, 500);
        fields[14] = new OtherField(MonopolyConstants.FIELD_NAMES[14], 15);
        fields[15] = new ShipField(MonopolyConstants.FIELD_NAMES[15], 16, 500);
        fields[16] = new StreetField(MonopolyConstants.FIELD_NAMES[16], 17, 500);
        fields[17] = new OtherField(MonopolyConstants.FIELD_NAMES[17], 18);
        fields[18] = new StreetField(MonopolyConstants.FIELD_NAMES[18], 19, 500);
        fields[19] = new StreetField(MonopolyConstants.FIELD_NAMES[19], 20, 500);
        fields[20] = new OtherField(MonopolyConstants.FIELD_NAMES[20], 21);
        fields[21] = new StreetField(MonopolyConstants.FIELD_NAMES[21], 22, 500); //Trianglen?
        fields[22] = new OtherField(MonopolyConstants.FIELD_NAMES[22], 23);
        fields[23] = new StreetField(MonopolyConstants.FIELD_NAMES[23], 24, 500);
        fields[24] = new StreetField(MonopolyConstants.FIELD_NAMES[24], 25, 500);
        fields[25] = new ShipField(MonopolyConstants.FIELD_NAMES[25], 26, 500);
        fields[26] = new StreetField(MonopolyConstants.FIELD_NAMES[26], 27, 500);
        fields[27] = new StreetField(MonopolyConstants.FIELD_NAMES[27], 28, 500);
        fields[28] = new BreweryField(MonopolyConstants.FIELD_NAMES[28], 29, 500);
        fields[29] = new StreetField(MonopolyConstants.FIELD_NAMES[29], 30, 500);
        fields[30] = new GoToJailField(MonopolyConstants.FIELD_NAMES[30], 31);
        fields[31] = new StreetField(MonopolyConstants.FIELD_NAMES[31], 32, 500);
        fields[32] = new StreetField(MonopolyConstants.FIELD_NAMES[32], 33, 500);
        fields[33] = new OtherField(MonopolyConstants.FIELD_NAMES[33], 34);
        fields[34] = new StreetField(MonopolyConstants.FIELD_NAMES[34], 35, 500);
        fields[35] = new ShipField(MonopolyConstants.FIELD_NAMES[35], 36, 500);
        fields[36] = new OtherField(MonopolyConstants.FIELD_NAMES[36], 37);
        fields[37] = new StreetField(MonopolyConstants.FIELD_NAMES[37], 38, 500);
        fields[38] = new OtherField(MonopolyConstants.FIELD_NAMES[38], 39);
        fields[39] = new StreetField(MonopolyConstants.FIELD_NAMES[39], 40, 500);


        /*for (int i = 0; fields.length > i; i++) {
            fields[i] = new Field(MonopolyConstants.FIELD_NAMES[i], i + 1);
        }*/
    }

    private void createDice() {
        dice = new Dice();
    }

    private void createPlayers(int numberOfPlayers) {
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Whats the name of player " + (i + 1) + "?");
            players.add(new Player(input.nextLine(), fields[0]));
        }
    }

    private void printFields() {
        for (int i = 0; fields.length > i; i++) {
            System.out.println(fields[i].toString());
        }
    }
}
