public class Solution {
    public void solution(int money) {
        Cock cock = new Cock();
        Hen hen = new Hen();
        Chicken chicken = new Chicken();
        int cockNum = (int)(money / cock.getValue());
        int henNum = (int)(money / hen.getValue());
        int chickenNum = (int) (money / chicken.getValue());

        for(int i = 0; i <= cockNum; i++) {
            for(int j = 0; j <= henNum; j++) {
                for (int k = 0; k <= chickenNum; k += 3) {
                    if((int)(i*cock.getValue() + j*hen.getValue() + k / 3) == 100 && i+j+k ==100) {
                        System.out.println("cock："+i+" hen："+j+" chicken："+k);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(100);
    }
}
