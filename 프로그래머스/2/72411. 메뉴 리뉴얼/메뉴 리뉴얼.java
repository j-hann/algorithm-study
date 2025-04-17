import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        
        List<String> result = new ArrayList<>();

        //모든 주문을 알파벳 순으로 정리
        for (int i = 0; i < orders.length; i++) {
            char[] chars = orders[i].toCharArray();
            Arrays.sort(chars);
            orders[i] = new String(chars);
        }

        //코드 메뉴 길이 꺼내서 처리
        for (int len : course) {
            Map<String, Integer> comboCount = new HashMap<>();
            //가장 많이 주문된 횟수
            int maxCount = 0;

            //각 주문에서 가능한 조합 찾기
            for (String order : orders) {
                MenuCombinationsOrder(order, "", 0, len, comboCount);
            }

            // max count 계산
            for (int count : comboCount.values()) {
                maxCount = Math.max(maxCount, count);
            }

            //2명 이상 주문했고, 가장 많이 주문된 조합 결과에 추가
            for (Map.Entry<String, Integer> entry : comboCount.entrySet()) {
                
                if (entry.getValue() >= 2 && entry.getValue() == maxCount) {
                    result.add(entry.getKey());
                }
            }
        }
        
        Collections.sort(result);
        return result.toArray(new String[0]);
    }

    // 주문 하나에서 조합 가능한 메뉴 세트 생성하고 comboCount에 추가
    private void MenuCombinationsOrder(String order, String comb, int idx, int targetLen, Map<String, Integer> comboCount) {
        
        //조합이 목표 길이에 도달했으면, comboCount에 기록
        if (comb.length() == targetLen) {
            comboCount.put(comb, comboCount.getOrDefault(comb, 0) + 1);
            return;
        }
        
        //글자 하나씩 추가해서 조합 만들기
        for (int i = idx; i < order.length(); i++) {
            //현재 글자 조합 더하고, 그 다음 글자 체크
            MenuCombinationsOrder(order, comb + order.charAt(i), i + 1, targetLen, comboCount);
        }
    }
}
