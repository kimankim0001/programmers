import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] s1 = {1, 5, 2};
        int[] s2 = {1, 5, 2};

        int[] n1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] n2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(solution.solution(3, s1, n1)));
        System.out.println(Arrays.toString(solution.solution(4, s2, n2)));
    }
}