class Solution {

    public int[] solution(long n) {
        // String 타입으로 변환
        // 배열의 길이 선언
        // 끝부터 순회하며 파싱
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            answer[i] = Integer.parseInt(str.substring(str.length() - 1 - i, str.length() - i));
        }
        return answer;
    }
}