import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 전략 :
        // 빌려줄 수 있는지 검사하는 반복문
        // 빌려줄 수 있는지의 조건문
        int answer = n;

        Arrays.sort(reserve);
        Arrays.sort(lost);

        answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -5;
                    reserve[j] = -5;
                    break;
                }
            }
        }
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] - 1 == reserve[j]){
                    answer++;
                    reserve[j] = -5;
                    break;
                } else if(lost[i] + 1 == reserve[j]){
                    answer++;
                    reserve[j] = -5;
                    break;
                }
            }
        }

        return answer;
    }
}