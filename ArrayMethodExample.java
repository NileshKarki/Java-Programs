public class ArrayMethodExample {
    
    // Method that takes an array of integers and modifies its elements
    public static void doubleArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2; // Double each element
        }
    }

    public static void main(String[] args) {
        // Define an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " "); // Output: 1 2 3 4 5
        }
        System.out.println();

        // Pass the array to the method
        doubleArray(numbers);

        // Print the modified array
        System.out.println("Modified array: ");
        for (int num : numbers) {
            System.out.print(num + " "); // Output: 2 4 6 8 10
        }
    }
}
