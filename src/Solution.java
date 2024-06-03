class Solution {
    public int solution(String t, String p) {
        // p의 길이만큼 t에서 substring 하고
        // p의 값과 비교해보기
        // int 타입으로 변환해야하고
        // for 문 반복범위를 t.length()-p.length()+1
        int answer = 0;

        long pp = Long.parseLong(p);
        int pl = p.length();
        for (int i = 0; i<t.length()-pl+1; i++){
            long tt = Long.parseLong(t.substring(i,i+pl));
            if (tt<=pp){
                answer++;
            }
        }

        return answer;
    }
}