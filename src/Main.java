public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] a1 = {"abc", "def", "ghi"};
        String[] a2 = {"abc", "bbc", "cbc"};

        System.out.println(solution.solution(a1, "ef"));
        System.out.println(solution.solution(a2, "c"));

    }
}