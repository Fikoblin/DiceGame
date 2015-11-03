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

        Player gracz = new PlayerComputer("Ziutek");
        Game game = new Game();
        
        try {
        game.setPlayer(null);
        game.play();
        } catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
        }
    }
}
