class Solution {
    public int GCD(int num1, int num2){
        if(num1 % num2 == 0) {
            return num2;
        }
        return GCD(num2, num1 % num2);
    }
    public int[] solution(int denom1, int num1, int denom2, int num2) {
        denom1 *= num2;
        denom2 *= num1;
        
        int[] answer = new int[] {denom1 + denom2, num1 * num2 };
        int max = GCD(answer[0], answer[1]);
        
        answer[0] /= max;
        answer[1] /= max;
        
        return answer;
    
    }
}