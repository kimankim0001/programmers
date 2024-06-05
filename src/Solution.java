class Solution {
    public String solution(String s, int n) {
        // char 타입은 아스키 코드 값으로 계산되니까 연산처리가 가능
        // for 문으로 공백일시 공백 리턴하고
        // 소문자일 경우랑 대문자일 경우 만들어주고
        // 그 안에 연산식으로 n 만큼 민 값을 반환하도록 코딩
        // Character.isLowerCase(ch) 소문자일때 true
        // Character.isUpperCase(ch) 대문자일때 true
        String answer = "";
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == ' '){
                answer += ch;
            } else if (Character.isLowerCase(ch)) {
                answer += (char) ((ch - 'a' + n)%26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                answer += (char) ((ch - 'A' + n)%26 + 'A');
            }
        }
        return answer;
    }
}