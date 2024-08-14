class Solution {

    public int solution(int n, int m, int[] section) {
        // 전략
        // 페인트가 칠해진 길이 n
        // 페인트를 칠하는 롤러의 길이 m
        // 페인트를 칠해야 하는 1미터 단위 구역 section
        int answer = 1;
        int index = section[0];
        for (int i = 1; i < section.length; i++) {
            if (index + m - 1 < section[i]) {
                answer++;
                index = section[i];
            }
        }
        return answer;
    }
}