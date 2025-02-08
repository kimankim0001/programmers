import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] arr1 = {293, 1000, 395, 678, 94};
        int[] arr2 = {94, 777, 104, 1000, 1, 12};        
//        int[][] arr2 = {{0,4},{1,2},{3,5},{7,7}};
                               
        System.out.println(Arrays.toString(s1.solution(arr1,arr2)));        
    }
}