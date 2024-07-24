import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 전략
        // 가로길이 n, 세로길이 m, 직사각형
        // 세로 1에서 가로 길이만큼 채우고
        // 다음 세로칸으로 이동 가로 길이만큼 채우기를 반복

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/12969