public class printAllPermutationOfString {
    public static void printPermn(String str, String permutation) {
        if(str.length() == 0){
            System.out.println(permutation); //Time Complexity = O(n!)
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            //"abc" -> "ac" 
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermn(newStr, permutation+currChar);

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermn(str, " ");
    }
}
