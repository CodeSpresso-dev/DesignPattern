package behavioral.strategy.fighter.Characters;

import behavioral.strategy.fighter.Fighter;
import behavioral.strategy.fighter.JumpBehavior;
import behavioral.strategy.fighter.KickBehavior;

public class ChunLi extends Fighter {
    public ChunLi(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    public void display() {
        System.out.println("Chunli");
    }
}
