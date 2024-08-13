class Solution {

    public int solution(int[] nums) {
        //전략
        // 3개의 수 더해서 소수가 되는 경우의 수
        // 소수 검증 매서드 사용

        int answer = 0;

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (isSosu(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    // 소수 검증 매서드
    private boolean isSosu(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}