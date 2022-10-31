package behavioral.strategy.fighter;

public abstract class Fighter {
    private KickBehavior kickBehavior;
    private JumpBehavior jumpBehavior;

    public Fighter(KickBehavior kickBehavior,JumpBehavior jumpBehavior){
        this.kickBehavior=kickBehavior;
        this.jumpBehavior=jumpBehavior;
    }
    public void punch(){
        System.out.println("Default punch");
    }
    public final void kick(){
        // delegate to kick behavior
        kickBehavior.kick();
    }
    public final void jump(){
        // delegate to jump behavior
        jumpBehavior.jump();
    }
    public void roll()
    {
        System.out.println("Default Roll");
    }

    public void setKickBehavior(KickBehavior kickBehavior) {
        this.kickBehavior = kickBehavior;
    }

    public void setJumpBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }
    public abstract void display();
}
