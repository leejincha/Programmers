class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 6 == 0){
            answer = n/6;
        }else{
                    int max = 0;
		
		for(int i=1; i<=n && i<=6; i++) 
		{
			if(n%i==0 && 6%i==0)
			{
				max = i;
			}
		}
        int min = (n * 6)/max;
            answer = min/6;
        }
        return answer;
    }
}