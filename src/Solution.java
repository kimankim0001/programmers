import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 전략 :
        // 키 밸류 저장하는 HashMap 을 사용
        // keymap 의 값을 HashMap 에 넣어주자
        // 이때, 중복되는 키 값은 비교하여 최소값으로 넣어주자
        // targets 의 값과 keypad 의 값의 중복값을 리턴해주고
        // 중복값이 없을 때는 -1을 리턴하고 종료
        // 이때, 앞선 값들이 있더라도 -1을 리턴해야 하므로 boolean 을 사용
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> keypad = new HashMap<>();

        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){
                char cur = keymap[i].charAt(j);
                if(keypad.containsKey(cur)){
                    int idx = keypad.get(cur);
                    keypad.put(cur, Math.min(idx, j+1));
                } else{
                    keypad.put(cur, j+1);
                }
            }
        }

        for(int i = 0; i < targets.length; i++){
            String target = targets[i];
            int count = 0;
            boolean flag = true;
            for(char cur : target.toCharArray()){
                if(keypad.containsKey(cur)){
                    count += keypad.get(cur);
                } else{
                    flag = false;
                    break;
                }
            }
            if(flag == false){
                answer[i] = -1;
            } else {
                answer[i] = count;
            }
        }

        return answer;
    }
}