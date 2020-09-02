package game_hero;

public interface Hero {

    void kick(Hero enemy);

    boolean isAlive();

    void getHit(int hitPower);

    void decreasePower(int points);

    int getPower();

    void makeDead();

    String getName();

}
