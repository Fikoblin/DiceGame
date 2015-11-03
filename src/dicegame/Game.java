/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import dicegame.players.Player;
import java.awt.List;
import java.util.Random;

/**
 *
 * @author Student
 */
public class Game {
    
    private Player player;
    
    //List lista = new List();

    int losowanie() {
        Random los = new Random();
        return los.nextInt(6) + 1;
    }

    public void play() {

       int zgad = 0, rzut = 0;
        do {
            System.out.println("Rzucam kością");
            rzut = losowanie();
            System.out.print(player.getName() + ": ");
            zgad = player.guess();
            System.out.println(zgad);
            if (rzut == zgad) {
                System.out.println("Zgadłeś! Wylosowana liczba to " + rzut);
            } else {
                System.out.println("Błąd! Spróbuj jeszcze raz");
            }
            System.out.println("=============");

        } while (rzut != zgad);
    }
    
    public void setPlayer(Player player) throws IllegalArgumentException {
        
        if(player != null) {
        this.player = player;
        }
        else {
            throw new IllegalArgumentException("Player nie może być null");
        }
    }
}
