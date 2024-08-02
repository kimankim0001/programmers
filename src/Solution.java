import java.util.Arrays;
import java.util.Comparator;

class Solution {

    public String[] solution(String[] strings, int n) {
        // 전략
        // 문자열 sort
        // n 번째 인덱스 기준으로 정렬

        String[] answer = {};

        Arrays.sort(strings);

        Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));

        answer = strings;
        return answer;
    }
}