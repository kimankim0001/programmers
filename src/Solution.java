class Solution {

    public int[] solution(int[] lottos, int[] win_nums) {
        // 전략
        // answer 최고 1위 최저 7위 선언
        // 민우 번호에 0 이 있으면 그만큼 최고 순위에 마이너스 적용
        // 이중 for 문으로 당첨번호와 민우 번호 비교
        // 번호가 같으면 최저에 플러스
        // 번호가 다르면 최고에 마니어스
        // 최고 최저 7위이면 6위로 적용
        int[] answer = {1, 7};
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                answer[0]--;
            }
        }
        for (int i = 0; i < 6; i++) {
            answer[0]++;
            for (int j = 0; j < 6; j++) {
                if (win_nums[i] == lottos[j]) {
                    answer[1]--;
                    answer[0]--;
                }
            }
        }
        if (answer[0] == 7) {
            answer[0] = 6;
        }
        if (answer[1] == 7) {
            answer[1] = 6;
        }
        return answer;
    }
}