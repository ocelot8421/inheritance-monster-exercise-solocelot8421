package hu.progmasters.exercise;

public class BlackUruk extends Orc{
    public BlackUruk(String name, int age, String color, boolean carnivorous, int hp) {
        super(name, age, color, carnivorous, hp);
        super.setFriendly(true);
    }
}
