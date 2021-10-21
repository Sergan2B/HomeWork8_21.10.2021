package kg.geektech.game.player;

public class Witcher extends Hero {

    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.HEARTS_OF_WITCHER);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        boolean live = true;
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() == 0 && live && heroes[i].getHealth() == 0) {
                heroes[i].setHealth(heroes[i].getHealth() + 150);
                live = false;
            }
        }
    }
}