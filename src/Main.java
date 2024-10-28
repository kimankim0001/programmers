import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] s1 = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] s2 = {4, 4, 4, 4, 4};

        System.out.println(Arrays.toString(solution.solution(5, s1)));
        System.out.println(Arrays.toString(solution.solution(4, s2)));
    }
}