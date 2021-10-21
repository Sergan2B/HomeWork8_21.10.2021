package kg.geektech.game.player;

import java.util.Random;

public class Thor extends Hero {
    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.SKIPPING_A_MOVE);
    }



    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random rast = new Random();
        Random rast1 = new Random();
        boolean randomStunThor1 = rast1.nextBoolean();
        boolean randomStunThor = rast.nextBoolean();
        if (randomStunThor && randomStunThor1) System.out.println("Босс пропустил ход!");

        int bossBeatSelf = boss.getDamage();
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0 && randomStunThor) {
                heroes[i].setHealth(heroes[i].getHealth() + bossBeatSelf);
            }
        }
    }
}
