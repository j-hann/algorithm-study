class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
		//체육 수업 들을 수 있는 학생 수
		int answer = 0;
		//전체 학생 수 만큼 배열 생성
		int[] students = new int[n + 1];
		//배열 값을 1로 초기화
		for(int i = 0; i < students.length; i++) {
			students[i] = 1;
		}

		//여벌 체육복 가져온 학생의 인덱스 값 증가
		for(int i = 0; i < reserve.length; i++){
			int reserveStudent = reserve[i];
			students[reserveStudent]++;
		}

		//도난 당한 학생 인덱스 값 감소
		for(int i = 0; i < lost.length; i++){
			int lostStudent = lost[i];
			students[lostStudent]--;
		}

		//여분 체육복 빌려주기
		for(int i = 1; i < students.length; i++){
			//체육복이 없는 학생이고, 앞 인덱스의 값이 2이면
			if(students[i] == 0 && students[i - 1] == 2){
				students[i]++;
				students[i - 1]--;
			} else {
				//뒤 인덱스 값이 2이면
				if(i + 1 < students.length && students[i] == 0 && students[i + 1] == 2){
					students[i]++;
					students[i + 1]--;
				}
			}
		}

		//체육 수업 들을 수 있는 학생 수 카운트
		for(int i = 1; i < students.length; i++){
			if(students[i] == 1 || students[i] == 2){
				answer++;
			}
		}

		return answer;
	}
}