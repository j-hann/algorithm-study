import java.util.*;

class Solution {
    public int solution(String numbers) {
        
        int answer = 0;
             
        //숫자 조합 저장
        Set<Integer> numberSet = new HashSet<>();
        
        //숫자 사용했는지 체크
        boolean[] check  = new boolean[numbers.length()];
        
        //입력받은 문자열 나눠서 int[] 넣기
        String[] numberStringList = numbers.split("");
        int[] numberList = new int[numberStringList.length];

        for(int i = 0; i < numberList.length; i++){
            numberList[i] = Integer.parseInt(numberStringList[i]);
        }
        
        //숫자 만들기
        numberCombination("", numberList, check, numberSet);
        
        //소수 개수 카운트
       for(int number : numberSet){
            //소수일 경우
            if(isPrimeNumber(number)){
                answer++;
            }
       }
       
        //소수 개수 반환
        return answer;
    }
    
    //숫자 조합 -> 재귀
    public void numberCombination(String current, int[] numberList, boolean[] check, Set<Integer> numberSet){
        //문자열이 있으면 숫자로 변환 후 저장
        if(!current.equals("")){
            numberSet.add(Integer.parseInt(current));
        }
        
        //숫자 조합
        for(int i = 0; i < numberList.length; i++){
        
            if(!check[i]){
                //해당 숫자 사용
                check[i] = true;
                numberCombination(current + numberList[i], numberList, check, numberSet);
                //숫자 사용 안함
                check[i] = false;
            }
        }
    }
    
    
    
    //소수 판별하는 메서드
    public boolean isPrimeNumber(int num) {
    
        if (num < 2) {
            return false;
        }
        
        for (int i = 2; i * i <= num; i++) {
                
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}