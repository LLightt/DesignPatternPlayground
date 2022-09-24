package ProxyPattern;

public class PursuitProxy implements IGiveGift{
    Pursuit gg;
    public PursuitProxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }
    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
