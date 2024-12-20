import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();
        
        int[][] arr1 = new int[][] {{572,22,37},{287,726,384},{85,137,292},{487,13,876}};
        int[][] arr2 = new int[][] {{57,192,534,2},{9,345,192,999}};
        int[][] arr3 = new int[][] {{1,2},{3,4}};


        System.out.println(Arrays.deepToString(s1.solution(arr1)));
        System.out.println(Arrays.deepToString(s1.solution(arr2)));
        System.out.println(Arrays.deepToString(s1.solution(arr3)));
        
    }
}