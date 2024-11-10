public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] a1 = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        int[][] a2 = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}};

        System.out.println(solution.solution(a1));
        System.out.println(solution.solution(a2));
    }
}