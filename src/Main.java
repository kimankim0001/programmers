public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] a1 = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int[][] a2 = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};

        System.out.println(solution.solution(a1));
        System.out.println(solution.solution(a2));
    }
}