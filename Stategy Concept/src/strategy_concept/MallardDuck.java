package strategy_concept;

import strategy_concept.interfaces.FlyWithWings;
import strategy_concept.interfaces.Squeak;

public class MallardDuck extends Duck{

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Squeak();
    }

    public void display(){}
}
