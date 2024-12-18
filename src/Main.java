import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();
        
        int[] n1 = new int[]{1, 2, 3, 4, 5};
        int[] n2 = new int[]{1, 2, 100, -99, 1, 2, 3};

        System.out.println(Arrays.toString(s1.solution(n1)));
        System.out.println(Arrays.toString(s1.solution(n2)));
        
    }
}