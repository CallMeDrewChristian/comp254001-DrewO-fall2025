//Drew Oro 301337741 F25 COMP254-001
public class Exercise1 {
    public static int multiplyResult(int m, int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return multiplyResult(m, n - 1) + m;
        }
    }
    public static void main(String[] args) {
        int[][] positiveInt = {
                {6, 7},
                {8,8},
                {20, 50},
                {100, 10},
                {12, 0},
                {400, 400},
                {1, 1}
        };
        for (int[] test : positiveInt) {
            int m = test[0];
            int n = test[1];
            int result = multiplyResult(m, n);
            int expected = m * n;
            if (result == expected) {
                System.out.println("Success! " + test[0] + " x " + test[1] + " = " + result);
            }
            else {
                System.out.println("ERROR: " + test[0] + " x " + test[1] + " = " + result);
            }
        }
    }
}