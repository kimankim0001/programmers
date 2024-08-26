class Solution {

    public int[] solution(int[] arr) {
        // 50 <= n && n % 2 = 0 이면 나누기 2
        // 50 > n && n % 2 = 1 이면 곱하기 2
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= 50) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] % 2 == 1 && arr[i] < 50) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}