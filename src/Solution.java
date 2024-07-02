import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;

        Map<String, Integer> rankMap = new HashMap<>();

        for (int i = 0; i < answer.length; i++) {
            rankMap.put(answer[i], i);
        }

        for (String player : callings) {
            int rank = rankMap.get(player);
            String pPlayer = answer[rank-1];
            answer[rank-1] = player;
            answer[rank] = pPlayer;
            rankMap.put(player, rank-1);
            rankMap.put(pPlayer, rank);
        }
        return answer;
    }
}