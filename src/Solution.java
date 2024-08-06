class Solution {

    public String solution(int[] food) {
        // 전략
        // 빨리 먹기 대회
        // ->>>> 물 <<<<-
        // 122233 0 332221
        // 물을 먼저 마시면 승리
        // 수웅이가 연습 위해 사온 음식 활용하기
        // 칼로리가 적은순으로 같은 양을 양쪽에 나열
        // food 인덱스 0 은 물 1로 고정
        // food 인덱스 1이 가장 낮은 칼로리
        // 음식의 배치를 나타내는 문자열을 리턴
        // StringBuilder 사용
        // 앞단 나누기 2 해서 나온만큼 인덱스값 반복
        // food 크기만큼 반복해주고 "0" 붙이기
        // 앞단 뒤집어서 붙이기

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            sb.append(String.valueOf(i).repeat(count));
        }

        String answer = sb + "0";

        answer += sb.reverse();

        return answer;
    }
}