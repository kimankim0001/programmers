import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] n1 = {4, 2, 6, 1, 7, 6};
        int[] n2 = {4, 2, 6, 1, 7, 6};

        System.out.println(Arrays.toString(solution.solution(n1, 2)));
        System.out.println(Arrays.toString(solution.solution(n2, 4)));
    }
}