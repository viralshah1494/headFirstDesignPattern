package chapter1.version1;

public abstract class Duck {
    public void quack() {
        System.out.println("Quacking");
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public void fly() {
        System.out.println("flying");
    }

    public abstract void display();
}
