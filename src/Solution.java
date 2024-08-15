class Solution {

    public int solution(int number, int limit, int power) {
        // 전략
        // 기사 1~number 기사 번호
        // 기사 번호 약수 개수 = 기사 공격력
        // 협약 공격력 limit 넘을경우 협약기관에서 정한 공격력 power
        // 기사들의 총 공격력 answer

        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    cnt++;
                } else if (i % j == 0) {
                    cnt += 2;
                }
            }
            if (cnt > limit) {
                cnt = power;
            }
            answer += cnt;
        }

        return answer;
    }
}