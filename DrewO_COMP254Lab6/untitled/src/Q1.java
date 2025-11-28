import java.util.Random;
public class Q1 {
    public static void testHashMap(double maxLoad, int numOperations) {
        ChainHashMap<Integer, String> map = new ChainHashMap<>(maxLoad);
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numOperations; i++) {
            int key = random.nextInt(100000);
            map.put(key, "Value" + key);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Load factor: " +  maxLoad + ", Operations: " + numOperations + " Time: " + duration + " ms");
    }
    public static void main(String[] args) {
        double[] loadFactors = {0.3, 0.5, 0.7, 0.9};
        int[] dataSizes = {1000,5000};
        for (double loadFactor : loadFactors) {
            for (int dataSize : dataSizes) {
                testHashMap(loadFactor, dataSize);
            }
        }
    }
}