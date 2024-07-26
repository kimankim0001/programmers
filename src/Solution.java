class Solution {

    public int solution(int n) {
        // 전략
        // n%3 을 String 타입의 변수에 반복해서 할당
        // N진법 -> 10진법 으로 바꾸는 Integer.parseInt(i, N); 활용
        int answer = 0;

        String str = "";
        while (n != 0) {
            str += n % 3;
            n /= 3;
        }

        return answer = Integer.parseInt(str, 3);
    }
}