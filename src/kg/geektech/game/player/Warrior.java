package kg.geektech.game.player;

import java.util.Random;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        //boolean anoster;
        int criticalDamage = (int) (2 + Math.random() * 3);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this == heroes[i]) {
                System.out.println(criticalDamage);
                this.setDamage(this.getDamage() * criticalDamage);
               /* anoster = true;
                if (anoster) {
                    this.setDamage(((this.getDamage() - 2) / criticalDamage) + 1);
                }*/
            }
        }
    }
}
