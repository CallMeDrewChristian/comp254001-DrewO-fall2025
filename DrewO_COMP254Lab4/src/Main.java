import lists.LinkedPositionalList;
import lists.Position;
import lists.PositionalList;

public class Main {

    public static void main(String[] args) {
        // Create a positional list (using LinkedPositionalList implementation)
        PositionalList<String> list = new LinkedPositionalList<>();

        // Add some elements and store their positions
        Position<String> posA = list.addFirst("A");
        Position<String> posB = list.addAfter(posA, "B");
        Position<String> posC = list.addAfter(posB, "C");
        Position<String> posD = list.addLast("D");

        // Test the indexOf method
        System.out.println("Index of A: " + list.indexOf(posA)); // Should be 0
        System.out.println("Index of B: " + list.indexOf(posB)); // Should be 1
        System.out.println("Index of C: " + list.indexOf(posC)); // Should be 2
        System.out.println("Index of D: " + list.indexOf(posD)); // Should be 3

        // Test edge cases
        System.out.println("Empty list test: " + new LinkedPositionalList<String>().indexOf(posA)); // Should be -1

        // Test after modifications
        list.addBefore(posB, "X");
        System.out.println("Index of B after insertion: " + list.indexOf(posB)); // Should now be 2
        System.out.println("Index of C after insertion: " + list.indexOf(posC)); // Should now be 3
    }
}
