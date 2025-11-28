public class Q2 {
    public static void main(String[] args) {
        SortedTableMap<Integer, String> map = new SortedTableMap<>();
        //Key and value doesnt exist
        System.out.println("map.containsKey(1): " + map.containsKey(1));
        System.out.println("map.get(1): " + map.get(1));
        System.out.println();
        //Key exists
        map.put(1, "Cats");
        System.out.println("map.containsKey(1): " + map.containsKey(1));
        System.out.println("map.get(1): " + map.get(1));
        System.out.println();
        map.put(2, null);
        //Null value, key exist
        System.out.println("map.containsKey(2): " + map.containsKey(2));
        System.out.println("map.get(2): " + map.get(2));
        System.out.println();
        //Null key and key
        System.out.println("map.containsKey(3): " + map.containsKey(3));
        System.out.println("map.get(3): " + map.get(3));
        System.out.println();
    }

}
