import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {10, 100, 20, 150, 1, 100, 200};
        int[] b = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        System.out.println(Arrays.toString(solution.solution(3,a)));
        System.out.println(Arrays.toString(solution.solution(4,b)));



    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/138477