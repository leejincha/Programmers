class Solution {
    public int solution(int n) {
        String num3 = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(num3);
        String reverse = sb.reverse().toString();
        int answer = Integer.parseInt(reverse,3);
        
        return answer;
    }
}