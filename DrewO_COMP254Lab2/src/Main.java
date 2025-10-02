//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static double[] doubleRandomArray(int n) {
        Random newRan  = new Random();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = newRan.nextDouble();
        }
        return array;
    }

    public static int[] intRandomArray(int n) {
        Random newRan  = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = newRan.nextInt();
        }
        return array;
    }
    public static void runPrefixAverage1(int n, String s) {
        long startTime;
        long endTime;
        long elapsed;
        double[] array = doubleRandomArray(n);
        startTime = System.currentTimeMillis();
            PrefixAverage.prefixAverage1(array);
        endTime = System.currentTimeMillis();
        elapsed = endTime-startTime;
        System.out.println("Elapsed time of "+s+": " + elapsed + "ms in Average1");
    }
    public static void runPrefixAverage2(int n, String s) {
        long startTime;
        long endTime;
        long elapsed;
        double[] array = doubleRandomArray(n);
        startTime = System.currentTimeMillis();
        PrefixAverage.prefixAverage2(array);
        endTime = System.currentTimeMillis();
        elapsed = endTime-startTime;
        System.out.println("Elapsed time of "+s+": " + elapsed + "ms in Average2");
    }
    public static void runUnique1(int n, String s) {
        long startTime;
        long endTime;
        long elapsed;
        int[] array = intRandomArray(n);
        startTime = System.currentTimeMillis();
        Uniqueness.unique1(array);
        endTime = System.currentTimeMillis();
        endTime = System.currentTimeMillis();
        elapsed = endTime-startTime;
        System.out.println("Elapsed time of "+s+": " + elapsed + "ms in Unique1");
    }
    public static void runUnique2(int n, String s) {
        long startTime;
        long endTime;
        long elapsed;
        int[] array = intRandomArray(n);
        startTime = System.currentTimeMillis();
        Uniqueness.unique2(array);
        endTime = System.currentTimeMillis();
        endTime = System.currentTimeMillis();
        elapsed = endTime-startTime;
        System.out.println("Elapsed time of "+s+": " + elapsed + "ms in Uniqu2");
    }
    public static void main(String[] args) {
        //Exercise2 - This has shown that Average2 has executed efficiently compared to Average1 since Average1 is O(n^2)
        int n_1 = 1000;
        int n_2 = 10000;
        int n_3 = 100000;

        runPrefixAverage1(n_1, "n1");
        runPrefixAverage1(n_2, "n2");
        runPrefixAverage1(n_3, "n3");

        runPrefixAverage2(n_1, "n1");
        runPrefixAverage2(n_2, "n2");
        runPrefixAverage2(n_3, "n3");


         n_1 = 10000000;
        //Exercise3
        runUnique1(n_1, "n1");
        runUnique1(n_3, "n3");
        runUnique2(n_1, "n1");
        runUnique2(n_3, "n3");
    }
}