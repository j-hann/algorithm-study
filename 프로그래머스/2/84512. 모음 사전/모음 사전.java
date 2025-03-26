class Solution {
	//글자 배열 생성
	String[] wordList = {"A", "E", "I", "O", "U"};
	//방문 여부 체크
	private static boolean visited = false;
	//몇번째 단어인지 카운트
	private static int answer = 0;
	
	public int solution(String word){
		//초기화
		visited = false;
		answer = 0;

		dfs("", word);
		
		//몇번째 단어인지 반환
		return answer;
	}

	private void dfs(String currentString, String targetString){
		//방문했으면 바로 반환
		if(visited){
			return;
		}

		//단어 완성되면 카운트 -> 현재 문자열이 비어있지 않으면
		if(!currentString.isEmpty()){
			answer++;
		}
		
		//현재 문자열이 타켓 문자열이랑 같으면
		if(currentString.equals(targetString)){
			//방문
			visited = true;
			return;
		}

		//현재 문자열 길이가 5이면 바로 반환
		if(currentString.length() == 5){
			return;
		}

		for(int i = 0; i < wordList.length; i++){
			//재귀 호출
			//현재 문자열에서 wordList 문자들 붙여주기
			dfs(currentString + wordList[i], targetString);
		}
	}
}