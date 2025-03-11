import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
		int answer = 0;
		Map<String, Integer> categoryMap = new HashMap<>();

		//의상 종류별 개수 저장
		for (String[] cloth  : clothes) {
			//의상 종류 저장
			String category = cloth[1];
            
			//같은 의상 종류가 여러개일 수도 있으니까 기존 개수를 저장하고 +1씩 증가
			//해당 카테고리가 없으면 0을 반환
			categoryMap.put(category, categoryMap.getOrDefault(category, 0) + 1);
		}

		//초기값 설정 -> 곱셉 연산을 위해
		int totalCombination  = 1;

		//모든 의상 조합 경우의 수 구하기
		for (int count : categoryMap.values()) {
			//(의상개수 + 1)
			totalCombination = totalCombination * (count + 1);
		}
	
		//아무것도 입지 않은 경우
		answer = totalCombination - 1;
		return answer;
    }
}