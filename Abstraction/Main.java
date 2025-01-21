abstract class animal{
    abstract void sound();

    void eat(){
        System.out.println("animal is eating");
    }
}

class dog extends animal{
    void sound(){
        System.out.println("dog is bark");
    }
}

public class Main {

    public static void main(String[] args) {
        dog d = new dog();
        d.sound();
        d.eat();
    }
}