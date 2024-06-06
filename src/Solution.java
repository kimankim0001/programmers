class Solution {
    public int solution(String s) {
        // 배열에 영단어를 담고
        // 문자열 안에서 배열 안의 영단어랑 일치하는 걸 찾아주는데
        // 이걸 반복문으로 돌려주고
        // 일치하는걸 배열의 인덱스 값으로 바꿔주는 함수를 찾아봐야겠네
        // String a = "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세 ";
        // replace([기존문자],[바꿀문자])
        // a= a.replace("대한", "민국");
        // System.out.println(a);
        //결과값 : 무궁화 삼천리 화려강산 민국사람 민국으로 길이 보전하세
        // s.replace() 이걸 사용하면 되겠다
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < 10; i++){
            s = s.replace(arr[i],String.valueOf(i));
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
}