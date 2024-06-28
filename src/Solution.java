import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        // 전략 :
        // 배열을 순회하며 1,2,3,1 이 완성되면 answer++;
        // 완성된 1,2,3,1 없애고 다시 순회
        // 코드 :
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(ingredient[i]);
        // list.get(list.size()-4) == 1
        // list.get(list.size()-3) == 2
        // list.get(list.size()-2) == 3
        // list.get(list.size()-1) == 1
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < ingredient.length; i++) {
            list.add(ingredient[i]);
            if (list.size() >= 4 && list.get(list.size() - 4) == 1 && list.get(list.size() - 3) == 2 && list.get(list.size() - 2) == 3 && list.get(list.size() - 1) == 1) {
                answer++;
                for (int j = 0; j < 4; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        return answer;
    }
}