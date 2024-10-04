package org.ucu.edu.lotr;

import java.util.Random;

public class Knight extends Character {

    private static final int MAX_HEALTH = 12;
    private static final int MIN_HEALTH = 2;

    private static final int MAX_POWER = 12;
    private static final int MIN_POWER = 2;

    public Knight() {
        Random random = new Random();
        power = random.nextInt( MAX_POWER - MIN_POWER + 1) + MIN_POWER;
        hp = random.nextInt( MAX_HEALTH - MIN_HEALTH + 1) + MIN_HEALTH;
    }

    @Override
    public void kick(Character c) {
        Random random = new Random();
        int damage = random.nextInt( MAX_POWER - MIN_POWER + 1) + MAX_POWER;
        c.damage(damage);
    }
}
