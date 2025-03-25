import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {1, 2, 7, 10, 11};
        int[][] arr3 = {{1, 4},{9, 2},{3, 8},{11, 6}};
        
        boolean[] boo1 = {false, true, true, true, true, false, false};
        
        String[] str1 = {"3 - 4 = -3", "5 + 6 = 11"};
        String[][] str2 = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
                               
//        System.out.println(s1.solution(arr3));
//        System.out.println(s1.solution("hello", "ohell"));
        System.out.println(Arrays.toString(s1.solution(24)));
    }
}