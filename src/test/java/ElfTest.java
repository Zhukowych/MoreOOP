import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ucu.edu.lotr.Character;
import org.ucu.edu.lotr.Elf;
import org.ucu.edu.lotr.Hobbit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElfTest {
    private Character character;

    @BeforeEach
    public void init() {
        character = new Elf();
    }

    @Test
    public void testToString(){ assertEquals("Elf{hp=10, power=10}", character.toString());
    }

    @Test
    public void testKick() {
        Hobbit hobbit = new Hobbit();
        character.kick(hobbit);
        assertEquals(0, hobbit.getHp());
    }

}

