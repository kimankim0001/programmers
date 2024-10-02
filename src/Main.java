public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] a1 = {2021, 12, 28};
        int[] a2 = {1024, 10, 24};

        int[] b1 = {2021, 12, 29};
        int[] b2 = {1024, 10, 24};

        System.out.println(solution.solution(a1, b1));
        System.out.println(solution.solution(a2, b2));
    }
}