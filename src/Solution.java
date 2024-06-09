import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        // 중복값을 허용하지 않는 set 을 사용해서 모든 경우의 수를 다 더해보고
        // set 에 넣어주고 answer 배열에 하나씩 넣우주고 리턴
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<numbers.length; i++){
            for (int j = i+1; j<numbers.length; j++){
                int sum = numbers[i]+numbers[j];
                set.add(sum);
            }
        }
        int[] answer = new int[set.size()];
        int idx = 0;
        for (int num : set){
            answer[idx++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }
}