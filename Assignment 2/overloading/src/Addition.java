class A {
    void add(int i, int j) {
        System.out.println("Adding two integers: " + (i + j));
    }

    void add(int i, float j) {
        System.out.println("Adding int and float: " + (i + j));
    }

    void add(float i, int j) {
        System.out.println("Adding float and int: " + (i + j));
    }
}
public class Addition {
    public static void main(String[] args) {
        A a = new A();

        a.add(65, 35); // Calls add(int, int)
        a.add((short) 5, (short) 63); // Calls add(short, short)
        a.add(10, 7.8f); // Calls add(int, float)
        a.add(8.5f, 15); // Calls add(float, int)
    }
}