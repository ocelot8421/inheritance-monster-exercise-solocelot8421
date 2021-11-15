package hu.progmasters.exercise;

import java.util.Objects;

public class UrukHai extends Orc{
    public UrukHai(String name, int age, String color, boolean carnivorous, int hp) {
        super(name, age, color, carnivorous, hp);
        super.setFriendly(false);
    }

    public boolean inNominePatris(Human human){
        if (Objects.nonNull(human) && humans.contains(human)){
            humans.remove(human);
            return true;
        } else {
            return false;
        }
    }


}
