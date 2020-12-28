package chapter1.version1;

public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
}
