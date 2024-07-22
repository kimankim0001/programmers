class Solution {

    public boolean solution(String s) {
        // 전략
        // s.length() = 4~6
        // s = int type only
        // 아스키코드 48~57 로 비교

        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 48 || s.charAt(i) > 57) {
                answer = false;
            }
        }
        return answer;
    }
}