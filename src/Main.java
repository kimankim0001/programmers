import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] k1 = {"ABACD", "BCEFD"};
        String[] k2 = {"AA"};
        String[] k3 = {"AGZ", "BSSS"};

        String[] t1 = {"ABCD","AABB"};
        String[] t2 = {"B"};
        String[] t3 = {"ASA","BGZ"};

        System.out.println(Arrays.toString(solution.solution(k1,t1)));
        System.out.println(Arrays.toString(solution.solution(k2,t2)));
        System.out.println(Arrays.toString(solution.solution(k3,t3)));


    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/160586