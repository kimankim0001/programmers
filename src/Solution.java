class Solution {

    public int solution(int a, int b, int n) {
        // 전략
        // a 개를 주면 b 개를 돌려주는데에 n 개를 가져갔을때의 리턴
        // answer += n / a * b 상빈이가 받는 새콜라
        // n = (n / a * b) + (n % a) 상빈이가 가지고 있는 콜라
        // n >= a 콜라를 돌려 받을 수 있는 최소 조건

        int answer = 0;

        while (n >= a) {
            answer += n / a * b;
            n = (n / a * b) + (n % a);
        }
        return answer;
    }
}
