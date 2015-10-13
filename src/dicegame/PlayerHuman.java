/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PlayerHuman extends Player {

    Scanner scan = new Scanner(System.in);

    int guess() {
        return scan.nextInt();
    }
}
