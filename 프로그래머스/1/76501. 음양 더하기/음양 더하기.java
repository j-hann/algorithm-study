//signs 배열부터 체크해서 만약 인덱스 값이 false면 합 계산 변수에 음수 붙여서 넣기
//누적합 구해서 sum 반환

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        
        for(int i = 0; i < absolutes.length; i++){
            
            if(signs[i] == false){
                int temp = -absolutes[i];
                sum = sum + temp;
            } else {
                int temp = absolutes[i];
                sum = sum + temp;
            }
        }
        
        return sum;
    }
}