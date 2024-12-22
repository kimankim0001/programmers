import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();
        
        int[] arr1 = new int[]{3,2,4,1,3};
        boolean[] flag1 = new boolean[]{true, false, true, false, false};


        System.out.println(Arrays.toString(s1.solution(arr1,flag1)));
        
        
    }
}