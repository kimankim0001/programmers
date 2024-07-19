class Solution {

    public int solution(int left, int right) {
        // 전략
        // left++ <= right
        // 약수의 개수 카운트
        // 홀이면 -, 짝이면 +
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int countNum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countNum++;
                }
            }
            if (countNum % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}