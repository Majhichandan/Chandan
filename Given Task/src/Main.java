class A {
    // if we declare method only in parent class then the object only call the parentclass method
    void display(String s){
        System.out.println("hey " + s);
    }
}

class B extends A {

    void display(String s) {
        System.out.println("Displaying message: " + s);
    }
/*if we define the method in subclass then the object should call the sublass method only */
    // Method returning a String
    String display() {
        String result = "hi class b";
        System.out.println(result);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B(); // create the oject of the subclass
        String sc;
        b.display("csm"); // it is call the subclass method rather then parentclass method
        sc = b.display(); // it is call the string display method which is in subclass
        System.out.println("Message is : " + sc); // it is  simply print the message which is given in sc variable
    }
}
