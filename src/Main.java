import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] a = {1,2,3,4,5};
        int[] b = {1,3,2,4,2};

        System.out.println(Arrays.toString(solution.solution(a)));
        System.out.println(Arrays.toString(solution.solution(b)));

    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/42840