import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] e1 = {3, 76, 24};
        int[] e2 = {1, 2, 3, 4, 5, 6, 7};
        int[] e3 = {30, 10, 23, 6, 100};

        System.out.println(Arrays.toString(solution.solution(e1)));
        System.out.println(Arrays.toString(solution.solution(e2)));
        System.out.println(Arrays.toString(solution.solution(e3)));
    }
}