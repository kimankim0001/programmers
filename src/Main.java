import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {10000, 20, 36, 47, 40, 6, 10, 7000};

        System.out.println(Arrays.toString(solution.solution(a1, 4)));
        System.out.println(Arrays.toString(solution.solution(a2, 30)));
    }
}