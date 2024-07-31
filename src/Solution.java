class Solution {

    public String solution(String s, int n) {
        // 전략
        // 아스키 코드 이용
        // char 타입으로 연산
        // 공백은 그냥 공백처리
        // 소문자일 경우 answer += (char) ((ch - 'a' + n)%26 + 'a');
        // 대문자일 경우 answer += (char) ((ch - 'A' + n)%26 + 'A');
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                answer += ch;
            } else if (Character.isLowerCase(ch)) {
                answer += (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                answer += (char) ((ch - 'A' + n) % 26 + 'A');
            }

        }
        return answer;
    }
}