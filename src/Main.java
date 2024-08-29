import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] a1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] a2 = {1, 9, 3, 10, 13, 5};
        int[] a3 = {2, 100, 120, 600, 12, 12};

        System.out.println(Arrays.toString(solution.solution(3, a1)));
        System.out.println(Arrays.toString(solution.solution(5, a2)));
        System.out.println(Arrays.toString(solution.solution(12, a3)));

    }
}