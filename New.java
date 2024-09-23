class Box {
    double width, height, depth;
    Box() {
        this(1.0, 1.0, 1.0); // Calls the constructor with parameters
    }
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    void display() {
        System.out.println("Width: " + width + ", Height: " + height + ", Depth: " + 
depth);
    }
 }
 public class New {
    public static void main(String[] args) {
        Box box = new Box(); // Default constructor
        box.display(); // Output: Width: 1.0, Height: 1.0, Depth: 1.0
    }
 }