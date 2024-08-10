public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] a1 = {"i", "drink", "water"};
        String[] a2 = {"want", "to"};
        String[] a3 = {"i", "want", "to", "drink", "water"};

        String[] b1 = {"i", "water", "drink"};
        String[] b2 = {"want", "to"};
        String[] b3 = {"i", "want", "to", "drink", "water"};

        System.out.println(solution.solution(a1, a2, a3));
        System.out.println(solution.solution(b1, b2, b3));

    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/159994
