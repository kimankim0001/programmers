import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] a1 = {1, 1, 3, 3, 0, 1, 1};
        int[] a2 = {4, 4, 4, 3, 3};

        System.out.println(Arrays.toString(solution.solution(a1)));
        System.out.println(Arrays.toString(solution.solution(a2)));
    }
}