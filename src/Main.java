import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] s = {"sun", "bed", "car"};
        String[] s2 = {"abce", "abcd", "cdx"};

        System.out.println(Arrays.toString(solution.solution(s,1)));
        System.out.println(Arrays.toString(solution.solution(s2,2)));


    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/12915