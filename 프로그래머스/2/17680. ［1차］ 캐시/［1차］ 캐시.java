import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
	    int answer = 0;
		
		//캐시 사이즈가 0이면 전부 캐시 미스
		if (cacheSize == 0) {
			return cities.length * 5;
		}

		LinkedList<String> cache = new LinkedList<>();

        //해당 도시가 있는지 체크
		for (String city : cities) {
			//대소문자 구분없이
			city = city.toLowerCase();

            //캐시에 있으면
			if (cache.contains(city)) {
				//기존 위치에서 해당 도시 제거
				cache.remove(city);
				//캐시 히트 -> 1초 추가
				answer = answer + 1;
			} else {
                
				//캐시가 다 찼으면 가장 오래된 데이터부터 삭제
                if (cache.size() == cacheSize) {
					cache.poll();
				}

				//캐시 미스 -> 5초 추가
				answer = answer + 5;
			}
			//현재 도시 캐시 추가
			cache.add(city);
		}
		return answer;
    }
}