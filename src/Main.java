import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {2,4};
        int[][] arr2 = {{80,70},{90,50},{40,70},{50,80}};
        
        boolean[] boo1 = {false, true, true, true, true, false, false};
        
        String[] str1 = {"BACDE", "CBADF", "AECB", "BDA"};
        String[][] str2 = {{"rardss", "123"},{"yyoom", "1234"},{"meosseugi", "1234"}};
                               
        System.out.println(s1.solution("CBD",str1));
//        System.out.println(Arrays.toString(s1.solution(3,str1)));
//        System.out.println(Arrays.deepToString(s1.solution(arr1, 2)));
    }
}