package hu.progmasters.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Orc extends Monster{
    private boolean friendly;
    List<Human> humans = new ArrayList<>();
    private List<Weapon> weaponList;

    public Orc(String name, int age, String color, boolean carnivorous, int hp) {
        super(name, age, color, carnivorous, hp);
    }

    public boolean captureHuman(Human human){
        if (Objects.nonNull(human)){
            humans.add(human);
            return true;
        } else {
            return false;
        }
    }

    public void hurtEnemy(Monster monster, Weapon weapon){
        if (Objects.nonNull(monster) && monster.getHp() > 0){
            monster.setHp(monster.getHp() - weapon.getDamage());
        }
    }

    public boolean isFriendly() {
        return friendly;
    }

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }
}
