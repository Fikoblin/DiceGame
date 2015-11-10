/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import dicegame.players.Player;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Student
 */
public class Game {
    
    private Player player;
    
    private List<Player> players = new ArrayList<>();
    
    //List lista = new List();


    public void play() {
        
        Random dice = new Random();

       int zgad = 0, rzut = 0;
       
       System.out.println("Rzucam kością");
       rzut = dice.nextInt(6)+1;
        do {
                       
            for(int i=0;i<players.size();i++) {
            System.out.print(players.get(i).getName() + ": ");
            zgad = players.get(i).guess();
            System.out.println(zgad);
            if (rzut == zgad) {
                System.out.println("Zgadłeś! Wylosowana liczba to " + rzut);
            } else {
                System.out.println("Błąd! Spróbuj jeszcze raz");
            }
            System.out.println("=============");
            
            
            }

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
    
    public void addPlayer(Player player) {
        players.add(player);
    }
    
    public void displayPlayers() {
        
        for (Player player : players) {
            System.out.println(player.getName());
        }
        
        Iterator <Player> it = players.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next().getName());
        }
    }
}
