import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 455, 6, 4, -1, 45, 6};

        System.out.println(Arrays.toString(solution.solution(a1,"right")));
        System.out.println(Arrays.toString(solution.solution(a2,"left")));

    }
}