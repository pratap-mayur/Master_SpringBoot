import java.util.*;
public class ListLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc  = new Scanner (System.in);

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        for(int i=0;i<n;i++){
            System.out.println(list.get(i));
        }

    }
}
