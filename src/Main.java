import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] a1 = {1, 8, 3};
        int[] a2 = {9, 10, 11, 8};

        System.out.println(Arrays.toString(solution.solution(a1)));
        System.out.println(Arrays.toString(solution.solution(a2)));
    }
}