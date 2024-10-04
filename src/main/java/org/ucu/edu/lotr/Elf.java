package org.ucu.edu.lotr;

public class Elf extends Character {

    public Elf() {
        super();
        power = 10;
        hp = 10;
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < power) {
            c.kill();
        } else {
            c.setHp(c.getHp() - 1);
        }
    }
}
