import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] a1 = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        String[] a2 = {"x.x", ".x.", "x.x"};

        System.out.println(Arrays.toString(solution.solution(a1, 2)));
        System.out.println(Arrays.toString(solution.solution(a2, 3)));
    }
}