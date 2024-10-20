public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] s1 = {"p", "o", "s"};
        String[] s2 = {"z", "d", "x"};
        String[] s3 = {"s", "o", "m", "d"};

        String[] d1 = {"sod", "eocd", "qixm", "adio", "soo"};
        String[] d2 = {"def", "dww", "dzx", "loveaw"};
        String[] d3 = {"moos", "dzx", "smm", "sunmmo", "som"};

        System.out.println(solution.solution(s1, d1));
        System.out.println(solution.solution(s2, d2));
        System.out.println(solution.solution(s3, d3));
    }
}