package game_hero;

public class Elf extends AbstractHero {

    private static final int WEAKENING_POWER = 1;

    private static final String RACE = "Elf";

    public Elf(String name) {
        super(RACE, name, 10, 10);
    }

    @Override
    public void kick(Hero enemy) {
        System.out.println("Reducing the enemy's power");
        enemy.decreasePower(WEAKENING_POWER);
        if(power > enemy.getPower()) {
            System.out.println("Destroy enemies");
            enemy.makeDead();
        }
    }

}
