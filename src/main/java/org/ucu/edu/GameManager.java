package org.ucu.edu;
import org.ucu.edu.lotr.Character;

import java.util.Random;

public class GameManager {

    public static void fight(Character c1, Character c2) {
        Random rand = new Random();

        System.out.format("%s fights against %s\n", c1, c2);

        while (c1.isAlive() && c2.isAlive()) {
            int c = rand.nextInt(2);
            if (c == 0) {
                System.out.format("%s kicks %s -> ", c1, c2);
                c1.kick(c2);
                System.out.format("%s\n", c2);
            } else {
                System.out.format("%s kicks %s -> ", c2, c1);
                c2.kick(c1);
                System.out.format("%s\n", c1);
            }
            System.out.format("Results: %s, %s\n", c1, c2);
        }
    }

}
