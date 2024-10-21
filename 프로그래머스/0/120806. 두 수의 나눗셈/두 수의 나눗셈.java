class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100){
            //double 타입으로 형변환
            double result = ((double)num1 / num2) * 1000;
            //int 타입으로 형변환
            answer = (int)result;
        }//if
        return answer;
    }//solution
}//end class