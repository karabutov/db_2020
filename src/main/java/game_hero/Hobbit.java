package game_hero;

public class Hobbit extends AbstractHero {

    private static final String RACE = "Hobbit";

    public Hobbit(String name) {
        super(RACE, name, 0, 3);
    }

    @Override
    public void kick(Hero enemy) {
        System.out.println("Aaaaaaaaaaa");
    }

}
