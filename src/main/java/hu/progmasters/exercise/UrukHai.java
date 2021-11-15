package hu.progmasters.exercise;

import java.util.Objects;

public class UrukHai extends Orc{
    public UrukHai(String name, int age, String color, boolean carnivorous, int hp) {
        super(name, age, color, carnivorous, hp);
        super.setFriendly(false);
    }

    public boolean NotTestedUrukHai(Human human){
        if (Objects.nonNull(human) && humanList.contains(human)){
            humanList.remove(human);
            return true;
        } else {
            return false;
        }
    }
}
