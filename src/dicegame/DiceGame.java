/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import dicegame.players.Player;
import dicegame.players.PlayerComputer;
import java.util.Random;

/**
 *
 * @author Student
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    static int losowanie() {
        Random los = new Random();
        return los.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int zgad = 0, rzut = 0;
        Player gracz = new PlayerComputer("Ziutek");
        do {
            System.out.println("Rzucam kością");
            rzut = losowanie();
            System.out.print("Strzelam, że... ");
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
