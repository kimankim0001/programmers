class Solution {

    public String solution(int n) {
        // 전략
        // 인덱스 번호가 짝수면 수
        // 인덱스 번호가 홀수면 박
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }
}