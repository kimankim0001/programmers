import java.util.Arrays;

class Solution {

    public int[] solution(int[] array, int[][] commands) {
        // 전략
        // command 의 0번째 인덱스 숫자부터 1번째 인덱스 숫자까지
        // 이후에 정렬해서 2번째 인덱스 숫자의 위치에 있는걸 반환

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }
}