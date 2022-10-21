import java.util.*;

public class sortedInAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;
        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[i + 1]) {
                // this is condition for ascending
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("This array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
    }
}
