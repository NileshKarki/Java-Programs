class Example {
    public void finalize() {
        System.out.println("Object is being garbage collected.");
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        // Both obj1 and obj2 refer to objects
        obj1 = null; // obj1 is now eligible for garbage collection
        obj2 = null; // obj2 is now eligible for garbage collection

        // Suggesting garbage collection
        System.gc();
    }
}
