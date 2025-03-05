class Solution{
    public int solution(int n, int a, int b) {
        int answer = 0;
        //몇번째 라운드에서 만나는지 카운트
        int count = 0;
        
        //a 참가자와 b 참가자가 같은 번호가 될 때까지 반복
        while(a != b){
            
            a = (a + 1) / 2;
            b = (b + 1) / 2;
                
            count++;
        }
    
        answer = count;
        return answer;
    }
}