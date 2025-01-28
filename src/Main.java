import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();

        String[] str1 = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] arr1 = {true, false, true, false};
                               
        System.out.println(Arrays.toString(s1.solution(str1,arr1)));        
    }
}