import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();
        
        int[] n1 = new int[]{0,1,1,2,2,3};
        int[] n2 = new int[]{0,1,1,1,1};

        System.out.println(Arrays.toString(s1.solution(n1,3)));
        System.out.println(Arrays.toString(s1.solution(n2,4)));
        
    }
}