/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Random;

/**
 *
 * @author Student
 */
public class PlayerComputer extends Player {

    int guess() {
        Random los = new Random();
        return los.nextInt(6) + 1;
    }
}