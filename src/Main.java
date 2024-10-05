public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] a1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] a2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        int[] a3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(solution.solution(a1, "right"));
        System.out.println(solution.solution(a2, "left"));
        System.out.println(solution.solution(a3, "right"));
    }
}