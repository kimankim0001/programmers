class Solution {

    public String solution(String my_string) {
        String answer = my_string;

        String[] replace = {"a", "e", "i", "o", "u"};

        for (String i : replace) {
            answer = answer.replaceAll(i, "");
        }
        return answer;
    }
}