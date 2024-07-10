class Solution {

    public String solution(String[] seoul) {
        // 전략 :
        // if(i == "Kim")
        // 인덱스 번호 반환
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}