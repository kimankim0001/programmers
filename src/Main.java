public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] f1 = {"muzi", "ryan", "frodo", "neo"};
        String[] f2 = {"joy", "brad", "alessandro", "conan", "david"};
        String[] f3 = {"a", "b", "c"};

        String[] g1 = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        String[] g2 = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        String[] g3 = {"a b", "b a", "c a", "a c", "a c", "c a"};

        System.out.println(solution.solution(f1, g1));
        System.out.println(solution.solution(f2, g2));
        System.out.println(solution.solution(f3, g3));
    }
}