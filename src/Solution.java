class Solution {
    public String solution(String s) {
        // 전략
        // 길이가 짝수면 두글자 홀수면 한글자
        // s.substring
        // s.length/2-1, s.length/2+1
        // s.length/2, s.length/2+1
        String answer = "";

        if (s.length() % 2 == 0) {
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        } else {
            answer = s.substring(s.length()/2, s.length()/2+1);
        }
        return answer;
    }
}