package game_hero;

import design_patterns.template_method.Game;

public class GameManager {

    public void fight(Hero c1, Hero c2) {
        System.out.println(c1.getName() + " VS " + c2.getName());
        do {
            System.out.println(c1.getName() + " is attacking");
            c1.kick(c2);
            System.out.println(c2.getName() + " is attacking");
            c2.kick(c1);
        } while (c1.isAlive() && c2.isAlive());

        if(c1.isAlive()) {
            System.out.println(c1.getName() + " WIN!!!");
        } else {
            System.out.println(c2.getName() + " WIN!!!");
        }
    }

    public static void main(String[] args) {
        Hero hero1 = HeroFactory.getHero("Balabol");
        Hero hero2 = HeroFactory.getHero("Hicka");

        GameManager gm = new GameManager();
        gm.fight(hero1, hero2);
    }

}
