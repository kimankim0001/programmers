import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] i1 = {"0123456789", "9876543210", "9999999999999"};

        System.out.println(Arrays.toString(solution.solution(i1, 50000, 5, 5)));
    }
}