import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {0, 1, 2, 3, 4, 5};
        int[] arr2 = {4, 1, 2};        
//        int[][] arr2 = {{0,1},{1,2},{2,3}};
                               
//        System.out.println(s1.solution(arr1));
        System.out.println(Arrays.toString(s1.solution(arr1,arr2)));
    }
}