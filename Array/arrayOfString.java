/*Take an array of String input from the user & find cumulative (combined) length of all those strings */

import java.util.*;
public class arrayOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String array[] = new String[size];

        int totalLength = 0;

        for(int i=0; i<size; i++){
            array[i] = sc.next();
            totalLength += array[i].length();
        }
        System.out.println(totalLength);
    }
}
