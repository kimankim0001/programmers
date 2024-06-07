import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] a = {"sun", "bed", "car"};
        String[] b = {"abce", "abcd", "cdx"};
        int a1 = 1;
        System.out.println(Arrays.toString(solution.solution(a,a1)));
        System.out.println(Arrays.toString(solution.solution(b,2)));
    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/12915