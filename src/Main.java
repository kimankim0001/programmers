import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] a = {5, 9, 7, 10};
        int[] b = {2, 36, 1, 3};
        int[] c = {3, 2, 6};

        System.out.println(Arrays.toString(solution.solution(a, 5)));
        System.out.println(Arrays.toString(solution.solution(b, 1)));
        System.out.println(Arrays.toString(solution.solution(c, 10)));


    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/12910