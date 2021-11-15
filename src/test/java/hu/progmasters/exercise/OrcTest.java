package hu.progmasters.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OrcTest {


    @Test
    void testCaptureHuman_false() {
        UrukHai urukHai = new UrukHai("Dalk", 23, "white", true, 65);
        Human human = null;
        boolean actual = urukHai.captureHuman(human);
        assertFalse(actual);
    }

    @Test
    void testCaptureHuman_true() {
        UrukHai urukHai = new UrukHai("Dalk", 23, "white", true, 65);
        Human human = new Human("Jack", 35);
        boolean actual = urukHai.captureHuman(human);
        assertTrue(actual);
    }

    @Test
    void testCaptureHuman_true_1() {
        UrukHai urukHai = new UrukHai("Dalk", 23, "white", true, 65);
        Human human = new Human("Jack", 35);
        boolean actual = urukHai.captureHuman(human);
        assertEquals(1, urukHai.getHumans().size());
    }

    @Test
    void testHurtEnemy_valid() {
        UrukHai urukHai = new UrukHai("Dalk", 23, "white", true, 65);
        Weapon weapon = new Weapon("Sword", 50);
        BlackUruk blackUruk = new BlackUruk("Loret", 45, "black", false, 100);
        urukHai.hurtEnemy(blackUruk, weapon);
        assertEquals(50, blackUruk.getHp());
    }

    @Test
    void testHurtEnemy_invalid() {
        UrukHai urukHai = new UrukHai("Dalk", 23, "white", true, 65);
        Weapon weapon = new Weapon("Sword", 50);
        BlackUruk blackUruk = new BlackUruk("Loret", 45, "black", false, 0);
        urukHai.hurtEnemy(blackUruk, weapon);
        assertNotEquals(-50, blackUruk.getHp());
    }
}