class A {
    void display(){
        System.out.println("hello class A");

    }
    void methodA(){
        System.out.println("Method in class A");
    }
}
class B extends A{
    @Override
    void display() {
        System.out.println("hello class B");
    }
    void methodB(){
        System.out.println("Method in class B");
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.methodA(); // it will call the method of class A
       // a.methodB(); // if we did not comment it then it will show the erroe in program
                        // and if we  use the B b = new B() then it will work and call the method of class B
        a.display(); // it will cal the display method of class B
    }
}