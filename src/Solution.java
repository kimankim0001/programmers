class Solution {

    public int solution(int[] absolutes, boolean[] signs) {
        // 전략 :
        // if(signs[i] == true) {answer += absolutes[i]}
        // if(signs[i] == false) {answer -= absolutes[i]}
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else if (signs[i] == false) {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}