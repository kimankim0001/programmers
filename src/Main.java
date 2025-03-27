import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {11,11};
        int[][] arr3 = {{1, 4},{9, 2},{3, 8},{11, 6}};
        
        boolean[] boo1 = {false, true, true, true, true, false, false};
        
        String[] str1 = {"left", "right", "up", "right", "right"};
        String[][] str2 = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
                               
//        System.out.println(s1.solution(arr1,20));
//        System.out.println(s1.solution("hello", "ohell"));
        System.out.println(Arrays.toString(s1.solution(str1,arr1)));
    }
}