class Solution {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 전략
        // 카드 뭉치 cards1 cards2
        // 원하는 순서의 단어 배열 조합 goal
        // cards1 과 cards2 의 조합으로 goal 을 만들 수 있다면 Yes 리턴, 안되면 No 리턴
        String answer = "Yes";

        int cards1Index = 0;

        int cards2Index = 0;

        for (int i = 0; i < goal.length; i++) {
            if (cards1Index < cards1.length && goal[i].equals(cards1[cards1Index])) {
                cards1Index++;
            } else if (cards2Index < cards2.length && goal[i].equals(cards2[cards2Index])) {
                cards2Index++;
            } else {
                answer = "No";
            }
        }
        return answer;
    }
}