class Solution {

    public int solution(String[] order) {
        int answer = order.length * 4500;

        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("cafelatte")) {
                answer += 500;
            }
        }
        return answer;
    }
}