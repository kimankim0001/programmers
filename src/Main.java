public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[][] a1 = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"},
            {"orange", "orange", "red", "blue"}};
        String[][] a2 = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};

        System.out.println(solution.solution(a1, 1, 1));
        System.out.println(solution.solution(a2, 0, 1));
    }
}