import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {1, 4, 2, 5, 3};
//        int[] arr2 = {94, 777, 104, 1000, 1, 12};        
        int[][] arr2 = {{0,1},{1,2},{2,3}};
                               
//        System.out.println(s1.solution(arr1));
        System.out.println(Arrays.toString(s1.solution(arr1)));
    }
}