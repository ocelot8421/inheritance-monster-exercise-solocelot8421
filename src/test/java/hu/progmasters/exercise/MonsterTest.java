package hu.progmasters.exercise;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MonsterTest {

    @Test
    @DisplayName("eatFoot: Check if orc is carnivorous")
    void testEatFood_false() {
        Monster monster = new Monster();
        monster.setCarnivorous(false);
        monster.eatFood();
        assertEquals("Eat vegetable.", monster.eatFood());
    }

    @Test
    @DisplayName("eatFoot: Check if orc is carnivorous")
    void testEatFood_true() {
        Monster monster = new Monster();
        monster.setCarnivorous(true);
        monster.eatFood();
        assertEquals("Eat meat.", monster.eatFood());
    }
}