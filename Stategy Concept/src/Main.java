import strategy_concept.DecoyDuck;
import strategy_concept.Duck;
import strategy_concept.MallardDuck;
import strategy_concept.RedheadDuck;
import strategy_concept.interfaces.FlyNoWay;


public class Main {
    public static void main(String[] args) {
        Duck decoyDuck = new DecoyDuck();
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();

        decoyDuck.performQuack();
        decoyDuck.perfromFly();

        mallardDuck.performQuack();
        mallardDuck.perfromFly();

        redheadDuck.performQuack();
        redheadDuck.perfromFly();
        redheadDuck.setFlyBehavior(new FlyNoWay());
        redheadDuck.perfromFly();

    }
}