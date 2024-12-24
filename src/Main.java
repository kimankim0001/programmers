public class Main {

    public static void main(String[] args) {

        Solution s1 = new Solution();
                        
        int[] a1 = new int[]{49,13};
        int[] a2 = new int[]{100,17,84,1};
        int[] a3 = new int[]{1,2,3,4,5};
        
        int[] b1 = new int[]{70,11,2};
        int[] b2 = new int[]{55,12,65,36};
        int[] b3 = new int[]{3,3,3,3,3};        
        
        
        System.out.println(s1.solution(a1,b1));
        System.out.println(s1.solution(a2,b2));
        System.out.println(s1.solution(a3,b3));
        
    }
}