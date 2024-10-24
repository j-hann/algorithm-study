class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int total = 0;
        //배열 값 꺼내서 더하기
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }//for
        //평균
        answer = (double) total / arr.length;
        return answer;
    }//solution
}//end class