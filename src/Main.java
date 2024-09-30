import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 1, 1, 1, 1, 2};
        int[] a3 = {1, 0, 1, 1, 1, 3, 5};

        System.out.println(Arrays.toString(solution.solution(a1)));
        System.out.println(Arrays.toString(solution.solution(a2)));
        System.out.println(Arrays.toString(solution.solution(a3)));
    }
}