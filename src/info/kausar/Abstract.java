package info.kausar;

abstract class Human //when you create an abstract class you cant't create an object of it
{
    public abstract void eat(); // to declare method type should be abstract //abstract method created only in abstract class

    public void walk() {

    }

}

class Man extends Human {

    @Override
    public void eat() {
        System.out.println("eating");
    }
}

class woman extends Human {

    @Override
    public void eat() {
        System.out.println("Dieting");
    }
}

public class Abstract {
    public static void main(String[] args) {
//Human obj = new Human();
        Human obj = new Man();
        obj.eat();
        Human obj2 = new woman();
        obj2.eat();

    }
}
