package podyplomowe;

public class Cat {
    String name;
    String color;
    boolean hungry;
    int age;

    public void meetMyCat(){
        System.out.println("My cat is " + this.name + ".");
        System.out.println("My cat is " + this.age + " years old and his fur is " + this.color + ".");
        System.out.println("Let's see if my cat is hungry.\nAre you hungry?");
        this.feed();

    }
    public void meow() {
        System.out.println("Meow!");
    }

    public void feed() {
        if (this.hungry) {
            System.out.println("I'm hungry!");
            System.out.println("Cat is eating");
            this.hungry = false;
        } else {
            System.out.println("I'm not hungry but some snack is always well seen");
        }
        this.meow();
    }
}
