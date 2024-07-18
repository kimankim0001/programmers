class Solution {

    public int solution(int[] a, int[] b) {
        // 전략
        // 내적은 두 배열의 곱을 더한것
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}