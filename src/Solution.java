class Solution {
    public int[] solution(int[] arr) {
        // 전략
        // 배열길이 0이면 -1 리턴
        // arr 최소값 찾기
        // 최소값 제외하고 answer 에 넣기
        int[] answer = {};

        if (arr.length == 1) {
            answer = new int[arr.length];
            answer[0] = -1;
            return answer;
        }

        answer = new int[arr.length-1];

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[index] = arr[i];
                index++;
            }
        }

        return answer;
    }
}