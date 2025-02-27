class Solution {
    public long solution(int n) {
	    //상수 값
		final int DIVISOR = 1234567;
		//끝에 도달하는 방법 개수
		long answer = 0;

		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}

		//n-2 까지 가는 방법 개수
		long previousSecond = 1;
		//n-1 까지 가는 방법 개수
		long previousFirst = 2;

		for(int i = 3; i <= n; i++){
			answer = (previousSecond + previousFirst) % DIVISOR;
			previousSecond = previousFirst;
			//현재 값 넣기
			previousFirst = answer;
		}
		
		return answer;
    }
}