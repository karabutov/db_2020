package game_hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class HeroFactory {

    public abstract Hero createHero(String name);

    private static HeroFactory hobbitFactory = new HeroFactory() {
        @Override
        public Hero createHero(String name) {
            return new Hobbit(name);
        }
    };

    private static HeroFactory elfFactory = new HeroFactory() {
        @Override
        public Hero createHero(String name) {
            return new Elf(name);
        }
    };

    private static HeroFactory knightFactory = new HeroFactory() {
        @Override
        public Hero createHero(String name) {
            return new Knight(name);
        }
    };

    private static HeroFactory kingFactory = new HeroFactory() {
        @Override
        public Hero createHero(String name) {
            return new King(name);
        }
    };


    private static List heroesFactories = new ArrayList<HeroFactory>();

    static {
        heroesFactories.add(hobbitFactory);
        heroesFactories.add(elfFactory);
        heroesFactories.add(kingFactory);
        heroesFactories.add(knightFactory);
    }

    private static Random random = new Random();

    private static int NUM_OF_HEROES = 4;

    public static Hero getHero(String name){
        int pos = random.nextInt(NUM_OF_HEROES);
        HeroFactory heroFactory= (HeroFactory) heroesFactories.get(pos);
        return heroFactory.createHero(name);
    }
}
