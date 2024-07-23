import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] a1 = {{1, 2}, {2, 3}};
        int[][] a2 = {{1}, {2}};

        int[][] b1 = {{3, 4}, {5, 6}};
        int[][] b2 = {{3}, {4}};

        System.out.println(Arrays.deepToString(solution.solution(a1, b1)));
        System.out.println(Arrays.deepToString(solution.solution(a2, b2)));
    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/12950