class Solution {
    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);
        if(x == Integer.valueOf((int)x)){
            answer = (long)Math.pow(x+1, 2);
            return answer;
        }else{
            return -1;
        }
    }
}