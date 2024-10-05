public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("1 2 Z 3"));
        System.out.println(solution.solution("10 20 30 40"));
        System.out.println(solution.solution("10 Z 20 Z 1"));
        System.out.println(solution.solution("10 Z 20 Z"));
        System.out.println(solution.solution("-1 -2 -3 Z"));
    }
}