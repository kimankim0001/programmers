import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] a1 = {"muzi", "frodo", "apeach", "neo"};
        String[] a2 = {"con", "ryan"};

        String[] b1 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        String[] b2 = {"ryan con", "ryan con", "ryan con", "ryan con"};

        System.out.println(Arrays.toString(solution.solution(a1, b1, 2)));
        System.out.println(Arrays.toString(solution.solution(a2, b2, 3)));


    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/92334