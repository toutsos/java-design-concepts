package strategy_concept;

import strategy_concept.interfaces.FlyNoWay;
import strategy_concept.interfaces.MuteQuack;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    public void display(){}
}
