import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] n1 = {"may", "kein", "kain", "radi"};
        String[] n2 = {"kali", "mari", "don"};
        String[] n3 = {"may", "kein", "kain", "radi"};

        int[] y1 = {5, 10, 1, 3};
        int[] y2 = {11, 1, 55};
        int[] y3 = {5, 10, 1, 3};

        String[][] p1 = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        String[][] p2 = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};
        String[][] p3 = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};

        System.out.println(Arrays.toString(solution.solution(n1, y1, p1)));
        System.out.println(Arrays.toString(solution.solution(n2, y2, p2)));
        System.out.println(Arrays.toString(solution.solution(n3, y3, p3)));
    }
}