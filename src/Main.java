import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        int[][] arr11 = {{80,70},{90,50},{40,70},{50,80}};
        
        boolean[] boo1 = {false, true, true, true, true, false, false};
        
        String[] str1 = {"BACDE", "CBADF", "AECB", "BDA"};
        String[][] str2 = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
                               
//        System.out.println(s1.solution(5, arr1, arr2));
//        System.out.println(Arrays.toString(s1.solution(3,str1)));
        System.out.println(Arrays.deepToString(s1.solution(5, arr1, arr2)));
    }
}