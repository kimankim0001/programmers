class Solution {

    public long solution(int price, int money, int count) {
        // 전략
        // 기존 이용료 price
        // 내가 가진 돈 money
        // 이용 횟수 count
        // price * 1~count
        // 부족한 금액 result
        // 부족하지 않을 때는 0
        long answer = 0L;

        long total = 0;
        for (int i = 1; i <= count; i++) {
            total += price * i;
        }

        if (total > money) {
            answer = total - money;
        } else {
            answer = 0;
        }
        return answer;
    }
}