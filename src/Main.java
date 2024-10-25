public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] n1 = {1, 2, 3, 4};
        int[] n2 = {1, 2, 3, 4, 5, 6};
        int[] n3 = {1, 2, 3,};

        System.out.println(solution.solution(n1, 2));
        System.out.println(solution.solution(n2, 5));
        System.out.println(solution.solution(n3, 3));
    }
}