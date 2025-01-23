 class Assignment_1 {

    // Instance variable
    private int number;

    // Static block
    static {
        System.out.println("Static block: This runs once when the class is loaded.");
    }

    // Constructor
    public Assignment_1(int number) {
        this.number = number; // Assign value to the instance variable
        System.out.println("Constructor: Object created with number = " + number);
    }

    // Instance method
    public void displayNumber() {
        System.out.println("Method: The number is " + number);
    }

    // Instance block
    {
        System.out.println("Instance block: This runs before the constructor when an object is created.");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Main method: Program starts here.");

        // Creating an object of the Test class
        Assignment_1 obj1 = new Assignment_1(5);
        obj1.displayNumber();

        // Creating another object
        Assignment_1 obj2 = new Assignment_1(10);
        obj2.displayNumber();
    }
}