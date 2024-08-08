import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    public int[] solution(int k, int[] score) {
        // 전략
        // 랭킹을 k 만큼 담고 최소값을 리턴하다가
        // 담은 랭킹의 수가 k 보다 커지면 최소값을 없애고 다시 최소값을 리턴
        int[] answer = new int[score.length];

        List<Integer> rank = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            if (rank.size() > k) {
                rank.remove(Collections.min(rank));
            }
            answer[i] = Collections.min(rank);
        }

        return answer;
    }
}