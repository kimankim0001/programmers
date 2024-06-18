class Solution {
    public int solution(int[] nums) {
        // 3개의 수를 더하기
        // 소수이면 answer++;
        // 소수판별기
        int answer = 0;
        int sum = 0;
        // 3개의 수를 더하기
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    // 소수이면 answer++;
                    if (isSosu(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    // 소수판별기
    private boolean isSosu(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}