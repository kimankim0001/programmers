public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] a1 = {"leo", "kiki", "eden"};
        String[] a2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] a3 = {"mislav", "stanko", "mislav", "ana"};

        String[] b1 = {"eden", "kiki"};
        String[] b2 = {"josipa", "filipa", "marina", "nikola"};
        String[] b3 = {"stanko", "ana", "mislav"};

        System.out.println(solution.solution(a1, b1));
        System.out.println(solution.solution(a2, b2));
        System.out.println(solution.solution(a3, b3));

    }
}