import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {1, 2, 1, 4, 5, 2, 9};
        int[][] arr3 = {{0,3},{1,2},{1,4}};
        
        boolean[] boo1 = {false, true, true, true, true, false, false};
        
        String[] str1 = {"u", "u", "l", "r"};
                               
//        System.out.println(s1.solution(str1));
//        System.out.println(s1.solution("hello", "ohell"));
        System.out.println(Arrays.toString(s1.solution(arr1)));
    }
}