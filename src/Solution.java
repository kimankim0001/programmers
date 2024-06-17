import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자 하나씩 배열에 패턴 담기
        // 수포자들의 점수 배열에 담기
        // 반복문으로 ansqwers 인덱스와 수포자들 인덱스값 같으면 점수 배열값 증가
        // 점수 배열 최대 값 찾기
        // 최고 점수 수포자 담기
        // 배열로 리턴

        // 수포자 하나씩 배열에 패턴 담기
        int[] supoza1 = {1,2,3,4,5};
        int[] supoza2 = {2,1,2,3,2,4,2,5};
        int[] supoza3 = {3,3,1,1,2,2,4,4,5,5};
        // 수포자들의 점수 배열에 담기
        int[] scores = {0,0,0};

        // 반복문으로 ansqwers 인덱스와 수포자들 인덱스값 같으면 점수 배열값 증가
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == supoza1[i%5]) {
                scores[0]++;
            }
            if(answers[i] == supoza2[i%8]) {
                scores[1]++;
            }
            if(answers[i] == supoza3[i%10]) {
                scores[2]++;
            }
        }

        // 점수 배열 최대 값 찾기
        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        // 최고 점수 수포자 담기
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            if(maxScore == scores[i]) {
                list.add(i+1);
            }
        }

        // 배열로 리턴
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}