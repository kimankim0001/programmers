import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        // 달력, 날짜 나타낼 수 있는 함수 찾기
        // 과제를 하면서 썼던 LocalDate 를 쓸 수 있지 않을까
        // import java.time.LocalDate; 임포트
        // of() 메소드는 전달된 인수를 가지고 특정 날짜를 표현하는 새로운 객체를 생성하여 반환
        // LocalDate date = LocalDate.of(2016, a, b);
        // 반환된 날짜를 요일로 나타내는 방법 찾기
        // answer = date.getDayOfWeek();
        // import java.time.DayOfWeek; 임포트
        // String 타입으로 반환해줘야했다
        // answer = String.valueOf(date.getDayOfWeek());
        // 3글자로 반환
        // answer = String.valueOf(date.getDayOfWeek()).substring(0,3);

        String answer = "";
        LocalDate date = LocalDate.of(2016, a, b);
        answer = String.valueOf(date.getDayOfWeek()).substring(0,3);

        return answer;
    }
}