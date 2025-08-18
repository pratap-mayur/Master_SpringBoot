import java.util.*;
public class DuplicateList {
    public static void main(String[] args) {
        //Scanner cs = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        //list.add(cs.next);
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        System.out.println(list.get(0) + " " + list.get(list.size()-1));
    }
}
