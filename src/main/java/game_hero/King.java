package game_hero;

import java.util.Random;

public class King extends AbstractHero {

    private static final String RACE = "King";

    private static Random random = new Random();

    public King(String name) {
        super(RACE, name, random.nextInt(11) + 5, random.nextInt(11) + 5);
    }

    @Override
    public void kick(Hero enemy) {
        int hitPower = getHitPower();
        System.out.println("Attack power is " + hitPower);
        enemy.getHit(hitPower);
    }

    protected int getHitPower(){
        return random.nextInt(power);
    }
}
