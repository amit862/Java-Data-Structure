import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        //Creation
        HashSet<Integer> set = new HashSet<>();
        
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //List.add(e1)

        //Size
        System.out.println("size of set is : "+set.size());

        //print all elements
        System.out.println(set);

        // //Search - contains
        // if(set.contains(1)) {
        //     System.out.println("set contains 1");
        // }

        // if(!set.contains(6)); {
        //     System.out.println("does not contain");
        // }

        // // Delete
        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("does not contain 1 - we deleted 1");
        // }

        //Iterator
        Iterator it = set.iterator();
        //hashNext; or next;
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
