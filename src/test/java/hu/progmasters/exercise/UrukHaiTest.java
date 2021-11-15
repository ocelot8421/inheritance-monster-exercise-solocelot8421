package hu.progmasters.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrukHaiTest {

    @Test
    void inNominePatris_true() {
        Human human = new Human();
        Human human1 = new Human();
        Human human2 = new Human();
        UrukHai urukHai = new UrukHai("Dalk", 23, "white", true, 65);
        urukHai.captureHuman(human);
        urukHai.captureHuman(human1);
        urukHai.captureHuman(human2);
        assertTrue(urukHai.inNominePatris(human));
        assertEquals(2, urukHai.getHumans().size());
    }

    @Test
    void inNominePatris_false() {
        Human human = new Human();
        Human human1 = new Human();
        Human human2 = new Human();
        UrukHai urukHai = new UrukHai("Dalk", 23, "white", true, 65);
        urukHai.captureHuman(human);
        urukHai.captureHuman(human1);
        assertFalse(urukHai.inNominePatris(human2));
    }
}