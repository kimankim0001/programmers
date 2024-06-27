class Solution {
    public String solution(String s, String skip, int index) {
        // 전략 :
        // 1. s 를 char c 로 하나씩 형변환
        // 2. index 만큼 c++
        // 2-1. 여기서 조건은 c > z 다시 a
        // 2-2. 추가 조건은 skip 과 중복일때 index 한번더 추가
        // 코드 :
        // 1. char c = s.charAt()
        // 2-1. if(c > z) {c = c - 26}
        // 2-2. if(skip.contains(String.valueOf(c))){i = i-1}
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            for(int j = 0; j < index; j++){
                c += 1;
                if(c > 'z'){
                    c -= 26;
                }
                if(skip.contains(String.valueOf(c))){
                    j--;
                }
            }
            answer += c;
        }
        return answer;
    }
}