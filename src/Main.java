public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] a1 = {2,4};
        int[] a2 = {2,4};
        int[] a3 = {3};
        int[] b1 = {1,3,5};
        int[] b2 = {3};
        int[] b3 = {1};

        System.out.println(solution.solution(5,a1,b1));
        System.out.println(solution.solution(5,a2,b2));
        System.out.println(solution.solution(3,a3,b3));
    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/42862