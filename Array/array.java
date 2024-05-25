public class array {

    public static void main(String[] args) {
        int array[] = { 1, 3, 2, 7, 5 };
        
        System.out.println(-1);
        for (int i = 1; i < array.length; i++) {
            for (int j = i+1; j < array.length; j--) {
                if (array[j] < array[i]) {
                    System.out.println(array[j]);
                    break;
                }
                if (j == -1) {
                    System.out.println("-, ");
                }
            }
        }
    }
}
