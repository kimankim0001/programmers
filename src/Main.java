import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] a1 = {0, 1, 1, 1, 0};
        int[] a2 = {0, 1, 0, 1, 0};
        int[] a3 = {0, 1, 1, 0};

        System.out.println(Arrays.toString(s.solution(a1)));
        System.out.println(Arrays.toString(s.solution(a2)));
        System.out.println(Arrays.toString(s.solution(a3)));

    }
}