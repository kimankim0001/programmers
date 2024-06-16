import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int k, int m, int[] score) {
        // 최종 함수 : k * m
        // score 를 내림차순으로 정렬
        // for (int i = 1; i*m-1 < score.length; i++)
        // answer += score[i*m] * m;
        Integer[] tmp = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Comparator.reverseOrder());
        int answer = 0;
        for (int i = 1; i*m-1 < tmp.length; i++){
            answer += tmp[i*m-1] * m;
        }

        return answer;
    }
}