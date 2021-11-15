package hu.progmasters.exercise;

public class Monster {
    private String name;
    private int age;
    private String color;
    private boolean carnivorous;
    private int hp;

    public Monster() {
    }

    public Monster(String name, int age, String color, boolean carnivorous, int hp) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.carnivorous = carnivorous;
        this.hp = hp;
    }

    public String notTestedCarnivorous(){
        String result;
        if (carnivorous){
            result = "Eat meat.";
        } else {
            result = "Eat vegetable.";
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCarnivorous() {
        return carnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
