class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        long big = gcd(w,h);
        long weight = (long)w;
        long height = (long)h;
        
        answer = weight*height - ((weight/big)+(height/big)-1)*big;
        
        return answer;
    }
    
    public static long gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return (long)a;
    }
}