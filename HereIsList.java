import java.util.*;
public class HereIsList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
