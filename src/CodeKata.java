class CodeKata {
    public boolean codekata(String s) {
        // 2가지 조건
        // 일단 길이가 4 or 6이 아니면 false
        // 다음에 하나씩 뽑아서 0~9까지의 숫자가 아니면 false
        // 문자라면 더 큰수가 반환되지 않을까
        // 했는데 실패... 찾아보니 아스키코드에서 0~9는 48~57 이었다

        boolean answer = true;
        if (s.length() != 4 && s.length() != 6){
            answer = false;
        }
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)<48 || s.charAt(i)>57){
                answer = false;
            }
        }
        return answer;
    }
}