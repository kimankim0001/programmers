import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {1, 3, 5, 7};

        System.out.println(Arrays.toString(solution.solution(n1)));
        System.out.println(Arrays.toString(solution.solution(n2)));
    }
}