import java.util.Arrays;
import java.util.Comparator;

class Solution {

    public int solution(int k, int m, int[] score) {
        // 전략
        // 한 상자에 사과를 m개씩 담기
        // 담긴 사과중 가장 낮은 점수 기준으로 가격 매겨짐 m * 낮은점수
        // 사과의 최대 점수 k
        // 상자 단위로 판매 남은 사과는 폐기

        Integer[] tmp = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder());
        int answer = 0;
        for (int i = 1; i * m - 1 < tmp.length; i++) {
            answer += tmp[i * m - 1] * m;
        }

        return answer;
    }
}