package org.ucu.edu;


import org.ucu.edu.lotr.Character;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        GameManager.fight(c1, c2);
    }
}