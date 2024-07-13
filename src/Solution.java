class Solution {
    public String solution(String phone_number) {
        // 전략 :
        // 스트링 잘라서 담을 배열 선언
        // 배열에 넣어주고
        // 인덱스값이 뒤에서부터 4번째보다 작으면 "*" answer 에 더해주고
        // 크거나 같으면 그냥 answer 에 하나씩 더해주기
        String answer = "";
        String[] num = new String[phone_number.length()];

        for (int i = 0; i < phone_number.length(); i++) {
            num[i] = String.valueOf(phone_number.charAt(i));
        }

        for (int i = 0; i < num.length; i++) {
            if (i < num.length - 4) {
                answer += "*";
            } else {
                answer += num[i];
            }
        }
        return answer;
    }
}