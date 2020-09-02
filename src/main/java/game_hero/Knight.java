package game_hero;

import java.util.Random;

public class Knight extends AbstractHero {

    private static final String RACE = "Knight";

    private static Random random = new Random();

    public Knight(String name) {
        super(RACE, name, random.nextInt(11) + 2, random.nextInt(11) + 2);
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
