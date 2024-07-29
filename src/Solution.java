class Solution {

    public int solution(String t, String p) {
        // 전략
        // p의 길이만큼 t에서 잘랐을때
        // t의 잘린값이 p의 값보다 작거나 같으면 answer++
        // String 타입이므로 비교를 하기 위해선 Int 타입으로 형변환
        // t.length()-p.length()+1
        // p의 길이만큼 t에서 substring 하고 비교해보기
        // Int 타입으로 하니까 런타임 에러, Long 타입으로 형변환
        // 1 ≤ p의 길이 ≤ 18

        int answer = 0;

        long pp = Long.parseLong(p);

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            long tt = Long.parseLong(t.substring(i, i + p.length()));
            if (tt <= pp) {
                answer++;
            }
        }

        return answer;
    }
}