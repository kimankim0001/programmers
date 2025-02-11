import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {0,1,2,3,4};
//        int[] arr2 = {94, 777, 104, 1000, 1, 12};        
        int[][] arr2 = {{0,1},{1,2},{2,3}};
                               
        System.out.println(Arrays.toString(s1.solution(arr1,arr2)));        
    }
}