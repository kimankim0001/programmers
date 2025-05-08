import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {2,4};
        int[] arr2 = {30, 1, 21, 17, 28};
        int[][] arr11 = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        
        boolean[] boo1 = {false, true, true, true, true, false, false};
        
        String[] str1 = {"and","notad","abcd"};
        String[][] str2 = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
                               
        System.out.println(s1.solution(10));
//        System.out.println(Arrays.toString(s1.solution(str1)));
//        System.out.println(Arrays.deepToString(s1.solution(5, arr1, arr2)));
    }
}