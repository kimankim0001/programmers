import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] a1 = {49, 12, 100, 276, 33};
        int[] a2 = {444, 555, 666, 777};

        System.out.println(Arrays.toString(solution.solution(a1, 27)));
        System.out.println(Arrays.toString(solution.solution(a2, 100)));
    }
}