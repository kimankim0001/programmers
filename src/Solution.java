class Solution {
    public int[] solution(int n, int m) {
        // 일단 최대공약수 구하는 방법과 최소공배수를 구하는 방법을 찾자
        // 최대공약수 유클리드 호제법 :
        // 큰수에서 작은수를 나눈 나머지 -> 작은수를 나머지로 나눈 나머지가 0이 될때까지 반복 -> 나머지가 0이 되면 작은수가 최대공약수
        // 최소공배수 : 두 수의 곱 / 최대공약수
        // answer[0] 과 answer[1] 에 각각 넣어주면 되겠다
        int[] answer = new int[2];
        int a = n;
        int b = m;
        if(n < m) {
            int temp = n;
            n = m;
            m = temp;
        }
        int r = 0;
        while(m > 0){
            r = n % m;
            n = m;
            m = r;
        }
        answer[0] = n;


        answer[1] = a * b / n;
        return answer;
    }
}