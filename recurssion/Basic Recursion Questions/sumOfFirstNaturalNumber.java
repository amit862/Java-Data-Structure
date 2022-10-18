public class sumOfFirstNaturalNumber {
    public static void printSum(int n, int i, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(n + 1, i, sum);
        System.out.println(i);
    }

    public static void main(String[] args) {
        printSum(5, 1, 0);
    }
}
