import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] a1 = {"AAA", "BBB", "CCC", "DDD"};
        String[] a2 = {"aBc", "AbC"};

        System.out.println(Arrays.toString(solution.solution(a1)));
        System.out.println(Arrays.toString(solution.solution(a2)));
    }
}