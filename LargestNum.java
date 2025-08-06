public class LargestNum {
    public static void main(String[] args) {
        int l =0;
        int[] num = {1,2,4,3,5,9};
        for(int n:num){
            if(n>l){
                l=n;
            }
        }
        System.out.println(l);
    }
}
