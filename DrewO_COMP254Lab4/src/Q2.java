import stacks.LinkedStack;
import stacks.Stack;

public class Q2 {
    public static <E> void transfer(Stack<E> stackA, Stack<E> stackB) {
        // Simply pop from S and push to T
        // This automatically achieves the desired order
        while (!stackA.isEmpty()) {
            stackB.push(stackA.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stackA = new LinkedStack<>();
        Stack<Integer> stackB = new LinkedStack<>();
        stackA.push(1);
        stackA.push(2);
        stackA.push(3);
        stackA.push(4);
        stackB.push(67);
        System.out.println("Before transfer:");
        System.out.println("Stack A: " + stackA.toString());
        System.out.println("Stack B: " + stackB.toString());
        transfer(stackA, stackB);
        System.out.println("After transfer:");
        System.out.println("Stack A: " + stackA.toString());
        System.out.println("Stack B: " + stackB.toString());
    }
}
