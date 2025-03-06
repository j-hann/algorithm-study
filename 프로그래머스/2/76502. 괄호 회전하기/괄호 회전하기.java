import java.util.*;

class Solution {
    public int solution(String s) {
		int answer = -1;

		//홀수 길이는 불가능 -> 올바른 괄호 문자열 안됨 0 반환
		if (s.length() % 2 == 1) {
			return 0;
		}
		
		//올바른 괄호 문자열 개수 카운트
		int validCount = 0;
		//현재 회전된 문자열 저장하는 변수
		String currentRotation = s;

		//문자열 한칸씩 회전하면서 유효한 괄호 문자열인지 검사
		for (int i = 0; i < s.length(); i++) {
			//현재 회전된 문자열이 올바른 괄호 문자열인지 검사
			if(isValid(currentRotation)){
				//맞으면 카운트
				validCount++;
			}

			//문자열 회전 -> 첫번째 문자 제거하고 맨 뒤에 추가
			currentRotation = currentRotation.substring(1) + currentRotation.charAt(0);
		}
		
		//유효한 괄호 문자열 개수 저장
		answer = validCount;
		return answer;
	}

	/**
	 * 문자열이 올바른 괄호 문자열인지 검증하는 메서드
	 * - 올바른 괄호 문자열이면 true, 아니면 false 반환
	 */
	private boolean isValid(String s) {
		//괄호 짝을 맞추기 위해서 스택 사용
		Stack<Character> stack = new Stack<>();

		//문자열의 각 문자를 하나씩 확인
		for (int i = 0; i < s.length(); i ++) {
			//현재 문자 저장
			char ch = s.charAt(i);

			//만약 여는 괄호인 경우 스택에 추가
			if (ch == '(' ||
				ch == '{' ||
				ch == '[') {
				stack.push(ch);
			} else {
				//닫는 괄호일 경우 스택 top과 짝이 맞는지 확인
				
				//스택이 비어있다면 올바른 괄호 문자열 아님
				if (stack.isEmpty()) {
					return false;
				}

				//스택 top 요소 가져오기
				char top = stack.pop();

				//현재 닫는 괄호와 스택 top의 여는 괄호가 맞지 않으면 false
				if ((ch == ')' && top != '(') ||
					(ch == '}' && top != '{') ||
					(ch == ']' && top != '[')) {
					return false;
				}
			}
		}
		//모든 문자 확인 후 스택이 비어 있어야지 올바른 괄호 문자열
		return stack.isEmpty();
    }
}