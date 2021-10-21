package kg.geektech.game.player;

public class Hacker extends Hero {

    public Hacker(int health, int damage) {
        super(health, damage, SuperAbility.HACKING);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() + (boss.getHealth()  / 999));
                }
            }
        }
    }

