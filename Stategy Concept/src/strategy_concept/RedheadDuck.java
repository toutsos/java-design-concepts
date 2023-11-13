package strategy_concept;

import strategy_concept.interfaces.FlyWithWings;
import strategy_concept.interfaces.Quack;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public void display(){}

}
