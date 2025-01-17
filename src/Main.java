import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();
        
        int[] a1 = {2,1,6};
        int[] a2 = {5,2,1,7,5};
                               
        System.out.println(Arrays.toString(s1.solution(a1,1)));
        System.out.println(Arrays.toString(s1.solution(a2,3)));
    }
}