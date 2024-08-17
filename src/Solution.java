class Solution {

    public int solution(String[] babbling) {
        // 전략 :
        // 반복되는 발음 "ayaaya", "yeye", "woowoo", "mama" 가 있으면 "X" 로 만들기
        // babbling 문자열에 "aya", "ye", "woo", "ma" 가 있으면 공백으로 만들기
        // 공백을 지웠을때 해당 문자열의 길이가 0이면 answer++;

        int answer = 0;

        String[] str = {"aya", "ye", "woo", "ma"};

        String[] repeatStr = {"ayaaya", "yeye", "woowoo", "mama"};

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < str.length; j++) {
                babbling[i] = babbling[i].replaceAll(repeatStr[j], "X").replaceAll(str[j], " ");
            }
            if (babbling[i].trim().length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}