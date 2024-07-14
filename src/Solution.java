class Solution {

    public int solution(int[] numbers) {
        // 전략 :
        // 0부터 9까지의 합 45
        // 배열 다 더해서 빼고 리턴
        int answer = 45;

        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }
}