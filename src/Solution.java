class Solution {
    public long solution(long n) {
        // 전략 :
        // long  -> String
        // String -> int[]
        // int[] 내림차순
        // int[] -> long

        String s = Long.toString(n);

        int[] intArr = new int[s.length()];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(s.substring(i, i + 1));
        }

        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
            }
        }

        String answer = "";

        for (int i = 0; i < intArr.length; i++) {
            answer += intArr[i];
        }

        return Long.parseLong(answer);


    }
}