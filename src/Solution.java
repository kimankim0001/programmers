class Solution {
    public int solution(String s) {
        int answer = 1;

        // 문자의 갯수
        int count = 1;

        // 이전 문자
        char x = s.charAt(0);

        // 문자를 비교 같으면 문자의 갯수 늘려주고 다르면 문자의 갯수 줄여주고
        // 문자의 갯수 0이되면 조건에 횟수가 같아지는 순간이므로 문자열 분리
        for (int i = 1; i < s.length(); i++) {
            if (count == 0) {
                answer++;
                x = s.charAt(i);
            }
            if (x == s.charAt(i)) {
                count++;
            } else {
                count--;
            }
        }
        return answer;
    }
}