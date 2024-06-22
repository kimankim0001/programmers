class Solution {
    public int solution(String[] babbling) {
        // 전략 :
        // 1.babbling 문자열에 "aya", "ye", "woo", "ma" 가 있으면 공백으로 만들기
        // 2.반복되는 발음 "ayaaya", "yeye", "woowoo", "mama" 가 있으면 "X" 로 만들기
        // 3.공백을 지웠을때 해당 문자열의 길이가 0이면 answer++;
        // 필요한 함수 :
        // 1.문자열에 해당되는 모든 값을 변경하는 replaceAll("찾아바꿀문자열", "넣어줄문자열")
        // 2.공백을 지워주는 trim()
        // 테스트 :
        // 전략의 1을 먼저 실행하면 반복되는 발음을 모두 공백으로 바꿔버림
        // 전략의 2를 먼저 실행하도록 리팩토링
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