import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {0, 1, 2, 4, 3};
//        int[] arr2 = {4, 1, 2};        
        int[][] arr3 = {{0,4,1},{0,3,2},{0,3,3}};
        
        boolean[] boo1 = {true, false, false, true, true};
        
        String[] str1 = {"u", "u", "l", "r"};
                               
//        System.out.println(s1.solution(str1));
        System.out.println(s1.solution(3,4,boo1));
    }
}