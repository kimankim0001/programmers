public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] a1 = {{0, 1}, {2, 5}, {3, 9}};
        int[][] a2 = {{-1, 1}, {1, 3}, {3, 9}};
        int[][] a3 = {{0, 5}, {3, 9}, {1, 10}};

        System.out.println(solution.solution(a1));
        System.out.println(solution.solution(a2));
        System.out.println(solution.solution(a3));
    }
}