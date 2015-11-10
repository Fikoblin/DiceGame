/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import dicegame.players.Player;
import dicegame.players.PlayerComputer;

/**
 *
 * @author Student
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game game = new Game();
        Player gracz = new PlayerComputer("Ziutek");
        game.addPlayer(gracz);
        
        Player gracz2 = new PlayerComputer("Janek");
        game.addPlayer(gracz2);
        
        game.displayPlayers();
        
        game.play();


    }
}