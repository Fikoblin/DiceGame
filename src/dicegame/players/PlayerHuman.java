/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame.players;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PlayerHuman extends Player {

    public PlayerHuman() {
    }

    public PlayerHuman(String name) {
        super(name);
    }
    Scanner scan = new Scanner(System.in);

    @Override
    public int guess() {
        return scan.nextInt();
    }
}
