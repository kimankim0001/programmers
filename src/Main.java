import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {1, 2, 7, 10, 11};
        int[][] arr3 = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        
        boolean[] boo1 = {false, true, true, true, true, false, false};
        
        String[] str1 = {"3 - 4 = -3", "5 + 6 = 11"};
        String[][] str2 = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
                               
        System.out.println(s1.solution(29183,1));
//        System.out.println(s1.solution("hello", "ohell"));
//        System.out.println(Arrays.toString(s1.solution(str1)));
    }
}