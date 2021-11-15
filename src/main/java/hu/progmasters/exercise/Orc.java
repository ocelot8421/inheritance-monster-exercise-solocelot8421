package hu.progmasters.exercise;

import java.util.List;
import java.util.Objects;

public class Orc extends Monster{
    private boolean friendly;
    List<Human> humanList;
    private List<Weapon> weaponList;

    public Orc(String name, int age, String color, boolean carnivorous, int hp) {
        super(name, age, color, carnivorous, hp);
    }

    public boolean notTestedOrc1(Human human){
        if (Objects.nonNull(human)){
            humanList.add(human);
            return true;
        } else {
            return false;
        }
    }

    private void notTestedORc2(Monster monster, Weapon weapon){
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

    public List<Human> getHumanList() {
        return humanList;
    }

    public void setHumanList(List<Human> humanList) {
        this.humanList = humanList;
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }
}
