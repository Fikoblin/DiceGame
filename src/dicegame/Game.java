/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import dicegame.players.Player;
import java.util.Random;

/**
 *
 * @author Student
 */
public class Game {

    static int losowanie() {
        Random los = new Random();
        return los.nextInt(6) + 1;
    }

    static void play(Player gracz) {

        int zgad = 0, rzut = 0;
        do {
            System.out.println("Rzucam kością");
            rzut = losowanie();
            System.out.print(gracz.getName() + ": ");
            zgad = gracz.guess();
            System.out.println(zgad);
            if (rzut == zgad) {
                System.out.println("Zgadłeś! Wylosowana liczba to " + rzut);
            } else {
                System.out.println("Błąd! Spróbuj jeszcze raz");
            }
            System.out.println("=============");

        } while (rzut != zgad);
    }
}
