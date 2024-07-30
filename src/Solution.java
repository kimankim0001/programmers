class Solution {

    public int solution(int[][] sizes) {
        // 전략
        // 가로 와 세로를 비교해서 더 큰 수를 가로에 몰아주기(회전)
        // 가로의 Max r 세로의 Max c
        int answer = 0;

        int max_r = 0;

        int max_c = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if (max_r < sizes[i][0]) {
                max_r = sizes[i][0];
            }
            if (max_c < sizes[i][1]) {
                max_c = sizes[i][1];
            }
        }

        return answer = max_r * max_c;
    }
}