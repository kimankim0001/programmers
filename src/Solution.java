class Solution {
    public String solution(String s) {
        // 전략 :
        // s 에서 하나씩 잘라내서 String 배열에 담기
        // String 배열과 길이가 같은 int 배열 선언
        // int 배열에 String 배열값 담기
        // 최대값과 최소값 구하기
        String answer = "";

        String[] strArr = s.split(" ");

        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int max = intArr[0];

        int min = intArr[0];

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
            if (intArr[i] < min) {
                min = intArr[i];
            }
        }
        answer = min + " " + max;

        return answer;
    }
}