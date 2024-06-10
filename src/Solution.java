class Solution {
    public int[] solution(String s) {
        // answer 길이 s.length() 와 동일하게 선언해주고
        // 이중 for 문을 돌려 같은 글자 answer[i] 에 저장
        // for 문 끝나고 answer[i] 가 0 이라면 같은 글자가 없으니까 -1 리턴
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++){
            for (int j = i; j >= 0; j--){
                if (s.charAt(i) == s.charAt(j) && answer[i] == 0){
                    answer[i] = i - j;
                }
            }
            if (answer[i] == 0){
                answer[i] = -1;
            }
        }
        return answer;
    }
}