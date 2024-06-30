import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] a1 = {".#...", "..#..", "...#."};
        String[] a2 = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        String[] a3 = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        String[] a4 = {"..", "#."};


        System.out.println(Arrays.toString(solution.solution(a1)));
        System.out.println(Arrays.toString(solution.solution(a2)));
        System.out.println(Arrays.toString(solution.solution(a3)));
        System.out.println(Arrays.toString(solution.solution(a4)));


    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/161990