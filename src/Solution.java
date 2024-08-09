import java.time.LocalDate;

class Solution {

    public String solution(int a, int b) {
        // 전략
        // a 월 b 일 의 요일찾기
        // 요일의 이름은 앞에 3글자
        String answer = "";

        LocalDate date = LocalDate.of(2016, a, b);

        answer = String.valueOf(date.getDayOfWeek()).substring(0, 3);

        return answer;
    }
}