class Solution {
    public int solution(int[] number) {
        // 인덱스 3개씩 뽑는거니까 3중 for 문으로 반복스해보자르
        int answer = 0;
        for (int i = 0; i<number.length; i++){
            for (int j = i+1; j<number.length; j++){
                for (int k = j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}