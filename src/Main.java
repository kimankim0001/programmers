import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] a1 = {"SOO", "OOO", "OOO"};
        String[] a2 = {"SOO", "OXX", "OOO"};
        String[] a3 = {"OSO", "OOO", "OXO", "OOO"};

        String[] b1 = {"E 2", "S 2", "W 1"};
        String[] b2 = {"E 2", "S 2", "W 1"};
        String[] b3 = {"E 2", "S 3", "W 1"};

        System.out.println(Arrays.toString(solution.solution(a1, b1)));
        System.out.println(Arrays.toString(solution.solution(a2, b2)));
        System.out.println(Arrays.toString(solution.solution(a3, b3)));

    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/172928