package strategy_concept;

import strategy_concept.interfaces.FlyBehavior;
import strategy_concept.interfaces.Quack;
import strategy_concept.interfaces.QuackBehavior;

public class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void swim(){
        System.out.println("I am swimming");
    }

    public void performQuack(){
        this.quackBehavior.perfrormQuack();
    }

    public void perfromFly(){
        this.flyBehavior.performFly();
    }


    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }




}
