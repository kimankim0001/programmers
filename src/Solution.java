import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        // 가로 a, 세로 b
        // 이중 for 문 으로 i 가 세로, j 가 가로
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++){
            for (int j = 0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// 문제 링크
// https://school.programmers.co.kr/learn/courses/30/lessons/12969