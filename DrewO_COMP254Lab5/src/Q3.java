public class Q3 {
    public static void main(String[] args) {
        HeapPriorityQueue<Integer, String> pq = new HeapPriorityQueue<>();
        pq.insert(5, "Five");
        pq.insert(3, "Three");
        pq.insert(8, "Eight");
        pq.insert(1, "One");
        System.out.println("Min element: " + pq.min().getValue());
    }
}
