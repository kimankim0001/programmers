class Solution {

    public int solution(int[] number) {
        // 전략
        // 세명의 번호의 합이 0 일때 삼총사 ++
        // 3중 for 문
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}