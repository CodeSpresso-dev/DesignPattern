package behavioral.strategy.fighter.test;

import behavioral.strategy.fighter.LongJump;
import behavioral.strategy.fighter.ShortJump;
import behavioral.strategy.fighter.TornadoKick;
import behavioral.strategy.fighter.Characters.Ken;

public class FighterDemo {
    public static void main(String[] args) {
        ShortJump shortJump = new ShortJump();
        TornadoKick tornadoKick = new TornadoKick();
        Ken ken = new Ken(tornadoKick, shortJump);
        ken.display();
        ken.punch();
        ken.jump();
        ken.kick();

        //change jump behavior dynamically. algorithms are interchangeable
        ken.setJumpBehavior(new LongJump());
        ken.jump();
    }
}
