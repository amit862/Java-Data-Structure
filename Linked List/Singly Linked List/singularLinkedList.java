import java.util.*;

public class singularLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.add("list");
        System.out.println(list);

        System.out.println(list.size());


        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+"-> ");
        }
        System.out.println("null");

        // list.removeFirst(); //for remove first element
        // System.out.println(list); 

        // list.removeLast();
        // System.out.println(list); //for remove last element

        list.remove(3); //for remove 3rd index
        System.out.println(list);
    }
}
