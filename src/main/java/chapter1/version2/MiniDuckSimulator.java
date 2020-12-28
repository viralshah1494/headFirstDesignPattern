package chapter1.version2;

import chapter1.version2.duck.Duck;
import chapter1.version2.duck.MallardDuck;
import chapter1.version2.duck.ModelDuck;
import chapter1.version2.fly.FlyRocketPowered;

import java.util.Hashtable;
import java.util.Map;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        Map<String, String> hashTable = new Hashtable<>();
    }
}
