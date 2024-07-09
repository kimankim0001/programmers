class Solution {
    public int solution(int num) {
        // 전략 :
        // num == 1 이면 answer 리턴
        // num % 2 == 0 이면 num/2
        // num % 2 == 1 이면 num*3+1
        // answer 500 넘어가면 -1 리턴
        // 연산중에 int 범위 넘어가는 경우 나오기 때문에 (long)num 으로 형변환
        int answer = 0;

        long n = (long)num;

        while (n != 1) {
            if (answer <= 500) {
                if (n % 2 == 0) {
                    n = n / 2;
                    answer++;
                } else if (n % 2 == 1) {
                    n = n * 3 + 1;
                    answer++;
                }
            } else {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}