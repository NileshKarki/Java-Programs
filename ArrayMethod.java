import java.util.Arrays;

public class ArrayMethod {
    
    public static void main(String[] args) {
        // Define an unsorted array
        int [] Fillthenumber=new int[4];
        int[] numbers = {5, 3, 8, 1, 2, 7, 6, 4};
        int[] numbers1 = {5, 3, 8, 1, 2, 7, 6, 4};

        //Fill the array
        Arrays.fill(Fillthenumber, 5);
        System.out.println("Fill " + Arrays.toString(Fillthenumber));
        
        // Sort the array
        Arrays.sort(numbers);
        
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        
        // Perform binary search for an element (e.g., 7)
        int searchElement = 7;
        int index = Arrays.binarySearch(numbers, searchElement);
        
        // Print the result of the binary search
        if (index >= 0) {
            System.out.println("Element " + searchElement + " found at index: " + index);
        } else {
            System.out.println("Element " + searchElement + " not found.");
        }
        System.out.println("Equal "+ Arrays.equals(numbers,numbers1));
    }
}
