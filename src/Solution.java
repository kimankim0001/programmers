class Solution {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 전략
        // 2차원 배열 같은 행 같은 열 끼리의 합
        // arr1[i][j] + arr2[i][j]
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}