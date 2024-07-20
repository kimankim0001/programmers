import java.util.Arrays;

class Solution {

    public String solution(String s) {
        // 전략
        // 배열에 넣기
        // 정렬
        // 문자열로 변경
        // 내림차순으로 정렬
        String answer = "";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String str = new String(arr);
        StringBuilder sb = new StringBuilder(str);
        answer = sb.reverse().toString();
        return answer;
    }
}