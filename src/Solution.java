import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 일단 문자열을 먼저 정렬해주고
        // 그 다음에 조건에 맞게 정렬하면 n 번째 인덱스가 같은걸 해결 가능
        // 최근에 다시 학습한 람다식을 사용스
        // 오류 확인, 유틸 임포트 안했음 습관화해야겠다
        String[] answer = {};
        Arrays.sort(strings);
        Arrays.sort(strings, Comparator.comparing((str) -> str.substring(n, n+1)));
        answer = strings;
        return answer;
    }
}