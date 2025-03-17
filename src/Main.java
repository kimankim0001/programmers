import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {1, 2, 3, 3, 3, 4};
        int[][] arr3 = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        
        boolean[] boo1 = {false, true, true, true, true, false, false};
        
        String[] str1 = {"meosseugi", "1234"};
        String[][] str2 = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
                               
        System.out.println(s1.solution(arr1));
//        System.out.println(s1.solution("hello", "ohell"));
//        System.out.println(Arrays.toString(s1.solution(5500)));
    }
}