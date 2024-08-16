import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] l1 = {44, 1, 0, 0, 31, 25};
        int[] l2 = {0, 0, 0, 0, 0, 0};
        int[] l3 = {45, 4, 35, 20, 3, 9};

        int[] w1 = {31, 10, 45, 1, 6, 19};
        int[] w2 = {38, 19, 20, 40, 15, 25};
        int[] w3 = {20, 9, 3, 45, 4, 35};

        System.out.println(Arrays.toString(solution.solution(l1, w1)));
        System.out.println(Arrays.toString(solution.solution(l2, w2)));
        System.out.println(Arrays.toString(solution.solution(l3, w3)));


    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/77484
