import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {0, 1, 2, 4, 3};
//        int[] arr2 = {4, 1, 2};        
        int[][] arr3 = {{0,4,1},{0,3,2},{0,3,3}};
                               
//        System.out.println(s1.solution("rermgorpsam",arr3));
        System.out.println(Arrays.toString(s1.solution(arr1,arr3)));
    }
}