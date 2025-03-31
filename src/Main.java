import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[][] arr3 = {{80,70},{90,50},{40,70},{50,80}};
        
        boolean[] boo1 = {false, true, true, true, true, false, false};
        
        String[] str1 = {"left", "right", "up", "right", "right"};
        String[][] str2 = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
                               
//        System.out.println(s1.solution(arr1));
//        System.out.println(Arrays.toString(s1.solution(arr3)));
        System.out.println(Arrays.deepToString(s1.solution(arr1, 2)));
    }
}