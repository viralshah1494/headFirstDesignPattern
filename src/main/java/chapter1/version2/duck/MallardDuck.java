package chapter1.version2.duck;

import chapter1.version2.fly.FlyBehavior;
import chapter1.version2.fly.FlyWithWings;
import chapter1.version2.quack.Quack;
import chapter1.version2.quack.QuackBehavior;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
