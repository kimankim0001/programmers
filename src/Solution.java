class Solution {
    public String solution(String myString) {
        String answer = "";

        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            if (Character.isUpperCase(ch)) {
                answer += ch;
            } else if (Character.isLowerCase(ch)){
                answer += Character.toUpperCase(ch);
            }
        }
        return answer;
    }
}