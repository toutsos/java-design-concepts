package strategy_concept.interfaces;

public class FlyNoWay implements FlyBehavior{
    public void performFly(){
        System.out.println("No fly...");
    }
}
