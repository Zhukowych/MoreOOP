package org.ucu.edu;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

import org.ucu.edu.lotr.Character;

public class CharacterFactory {

    public static Character createCharacter() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Random random = new Random();
        Reflections reflections = new Reflections("org.ucu.edu.lotr");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);

        int characterIndex = random.nextInt(subTypes.size());
        int i = 0;

        for (Class<? extends Character> characterClass: subTypes) {
            if (i != characterIndex) { i++; continue; }
            return characterClass.getDeclaredConstructor().newInstance();
        }

        return null;
    }

}