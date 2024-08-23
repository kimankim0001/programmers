import java.util.Arrays;

class Solution {

    public int[] solution(int[] numlist, int n) {
        // 전략
        // n 을 빼준 절대값을 비교해서 정렬
        // Math.abs
        int[] answer = new int[numlist.length];
        Arrays.sort(numlist);
        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if (Math.abs(numlist[i] - n) <= Math.abs(numlist[j] - n)) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }

        for (int i = 0; i < numlist.length; i++) {
            answer[i] = numlist[i];
        }
        return answer;
    }
}