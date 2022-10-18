
public class towerOfHanoi {
    public static void towerOfHanoie(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk" + n + "from" + src + "to" + dest); // time Complexity O(2^n-1) ~~ O(2^n)
            return;
        }
        towerOfHanoie(n - 1, src, dest, helper);
        System.out.println("Transfer disk" + n + "from" + src + "to" + dest);
        towerOfHanoie(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoie(n, "S", "H", "D");
    }
}



