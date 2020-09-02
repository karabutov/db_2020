package game_hero;

public abstract class AbstractHero implements Hero {

    protected int power;
    protected int hp;

    protected boolean isAlive = true;

    protected String race;

    protected String name;

    public AbstractHero(String race, String name, int power, int hp) {
        this.power = power;
        this.hp = hp;
        this.race = race;
        this.name = name;
    }

    @Override
    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public void getHit(int hitPower) {
        hp -= hitPower;
        if(hp <= 0) {
            makeDead();
        }
    }

    @Override
    public void decreasePower(int points) {
        power -= points;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void makeDead() {
        isAlive = false;
    }

    @Override
    public String getName() {
        return race + " " + name;
    }
}
