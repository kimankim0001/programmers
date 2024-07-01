import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String a1 = "2022.05.19";
        String a2 = "2020.01.01";

        String[] b1 = {"A 6", "B 12", "C 3"};
        String[] b2 = {"Z 3", "D 5"};

        String[] c1 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        String[] c2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};


        System.out.println(Arrays.toString(solution.solution(a1, b1, c1)));
        System.out.println(Arrays.toString(solution.solution(a2, b2, c2)));


    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/150370