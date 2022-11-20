import java.util.Arrays;


class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        char[] arr = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] += s.charAt(i);
        }
        Arrays.sort(arr);
        
        String num ="";
        for(int i = arr.length-1; i >=0; i--){
            num += arr[i];
        }
        
        return Long.parseLong(num);
    }
}