/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame.players;

import java.util.Random;

/**
 *
 * @author Student
 */
public class PlayerComputer extends Player {

    public PlayerComputer() {
    }

    public PlayerComputer(String name) {
        super(name);
    }

    @Override
    public int guess() {
        Random los = new Random();
        return los.nextInt(6) + 1;
    }
}