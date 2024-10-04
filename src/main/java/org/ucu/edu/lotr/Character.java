package org.ucu.edu.lotr;

public abstract class Character {

    protected int power;
    protected int hp;

    public abstract void kick(Character c);

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public void damage(int damage) {
        this.setHp(Math.max(hp - damage, 0));
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void kill() {
        setHp(0);
    }

    @Override
    public String toString() {
        return String.format("%s{hp=%d, power=%d}", this.getClass().getSimpleName(), hp, power);
    }

}
