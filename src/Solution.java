class Solution {

    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            while (n > 0) {
                if (n % 2 == 1) {
                    answer += n;
                    n--;
                } else {
                    n--;
                }
            }
        } else if (n % 2 == 0) {
            while (n > 0) {
                if (n % 2 == 0) {
                    answer += n * n;
                    n--;
                } else {
                    n--;
                }
            }
        }
        return answer;
    }
}