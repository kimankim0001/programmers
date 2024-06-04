class Solution {
    public int solution(int[][] sizes) {
        // 다차원배열
        // 먼저, 가로 와 세로를 비교해서 더 큰 수를 가로에 몰아주기(회전)
        // 가로의 Max 값과 세로의 Max 값 구하기
        // 리턴
        int max_r = 0;
        int max_c = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0]<sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if(max_r<sizes[i][0]){
                max_r = sizes[i][0];
            }
            if(max_c<sizes[i][1]){
                max_c = sizes[i][1];
            }
        }
        int answer = max_r*max_c;
        return answer;
    }
}