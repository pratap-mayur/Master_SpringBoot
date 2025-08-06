public class Palindrome {
    public static void main(String[] args) {
        String st = " rer ";
        int left =0;int right = st.length()-1;
        if(st.length() == 0 || st == ""){
            System.out.println("Enter a valid string");
            return;
        }
        for(int i=left;i<=right;i++){


            if(st.charAt(left)==st.charAt(right)){
                left++;
                right--;
            }else{
                System.out.println("string is not palindrome");
                return;
            }

        }
        System.out.println("string is palindrome");
    }
}
