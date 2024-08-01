class Solution {

    public int solution(String s) {
        // 전략
        // 0~9까지 영어로 나열
        // 반복문으로 영어를 숫자로 교체
        // replace([기존문자],[바꿀문자])
        // int 로 반환
        int answer = 0;

        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replace(arr[i], String.valueOf(i));
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}