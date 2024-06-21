import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] a = {44, 1, 0, 0, 31, 25};
        int[] a1 = {0, 0, 0, 0, 0, 0};
        int[] a2 = {45, 4, 35, 20, 3, 9};

        int[] b = {31, 10, 45, 1, 6, 19};
        int[] b1 = {38, 19, 20, 40, 15, 25};
        int[] b2 = {20, 9, 3, 45, 4, 35};

        System.out.println(Arrays.toString(solution.solution(a,b)));
        System.out.println(Arrays.toString(solution.solution(a1,b1)));
        System.out.println(Arrays.toString(solution.solution(a2,b2)));

    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/77484#