import java.util.*;

class Solution {
    // 전략
    // 두 개의 수를 더해서 만들 수 있는 모든 경우의 수
    // 모든 경우를 다 합치기
    // 중복값이 나오므로 set 사용
    // 정렬 sort
    public int[] solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }

        int[] answer = new int[set.size()];

        int idx = 0;

        for (int num : set) {
            answer[idx++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }
}