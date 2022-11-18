class Solution {
    public String solution(String s) {
        String answer = "";
        int num1 = s.length();
        int num2 = num1/2;
        if(num1 % 2 == 0){
            answer = s.substring(num2-1,num2+1);
        }else{
            answer = s.substring(num2,num2+1);   
        }
        return answer;
    }
}