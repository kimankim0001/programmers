import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        String[] arr1 = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] arr2 = {{0,4},{1,2},{3,5},{7,7}};
                               
        System.out.println(s1.solution(arr1, arr2));        
    }
}