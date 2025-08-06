import java.sql.SQLOutput;
import java.util.*;



public class ReverseAString {
//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Hello");
//        StringBuilder reverse = sb.reverse();
//        System.out.println(reverse);
//    }
public static void main(String[] args) {
    String s = "hellooye lucky lucky oye"; String s1="";
    for(int i=s.length()-1;i>=0;i--){
        s1+=s.charAt(i);
    }
    System.out.println(s1);
}
}
