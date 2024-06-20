class Solution {
    public int solution(int number, int limit, int power) {
        // 기사 1~number 넘버링
        // 기사 번호의 약수 개수 = 공격력
        // 협약 공격력 limit 넘을경우 협약기관에서 정한 공격력 power
        // 기사놈들의 총 공격력 구해야한다
        // 시간 초과 떠서 약수를 구하는 다른 방식 참고하여 리팩토링

        int answer = 0;
        // 기사들의 무기 공격력 구하기
        for (int i = 1; i <= number; i++){
            int cnt = 0;
            for (int j = 1; j*j <= i; j++){
                if(j*j==i){
                    cnt++;
                } else if(i % j == 0){
                    cnt+=2;
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