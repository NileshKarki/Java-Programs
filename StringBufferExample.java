public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // 1. Append: Adding more text
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. Insert: Insert text at a specific index
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // 3. Replace: Replace a portion of the string
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb);

        // 4. Delete: Remove characters in a range
        sb.delete(6, 10);
        System.out.println("After delete: " + sb);

        // 5. Reverse: Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. Capacity: Get current buffer capacity
        System.out.println("Capacity: " + sb.capacity());

        // 7. CharAt: Get character at index
        // System.out.println("Character at index 4: " + sb.charAt(4));

        // 8. Set Length: Modify the buffer length
        // sb.setLength(5);
        // System.out.println("After setting length to 5: " + sb);
    }
}
