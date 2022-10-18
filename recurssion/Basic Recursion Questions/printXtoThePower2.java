/*Print x^n(stack height = logn) */


public class printXtoThePower2 {
    public static int calcPower(int x, int n) {
        if (n == 0) { // base 1
            return 1;
        }
        if (x == 0) { // base 2
            return 0;
        }
        // if n is even
        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        }
        // if n is odd
        else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
