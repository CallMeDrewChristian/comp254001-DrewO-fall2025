import queues.LinkedQueue;
public class Q3 {
    public static void main(String[] args) {
        LinkedQueue<Integer> Queue1 = new LinkedQueue<>();
        LinkedQueue<Integer> Queue2 = new LinkedQueue<>();
        Queue1.enqueue(1);
        Queue1.enqueue(2);
        Queue1.enqueue(3);
        Queue2.enqueue(4);
        Queue2.enqueue(5);
        Queue2.enqueue(6);
        System.out.println("Before concatenation:");
        System.out.println("Queue 1: " + Queue1.toString());
        System.out.println("Queue 2: " + Queue2.toString());
        Queue1.concatenate(Queue2);
        System.out.println("After concatenation:");
        System.out.println("Queue 1: " + Queue1.toString());
        System.out.println("Queue 2: " + Queue2.toString());
    }
}
