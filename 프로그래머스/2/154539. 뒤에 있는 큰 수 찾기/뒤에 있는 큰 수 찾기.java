
class Solution {
    public int[] solution(int[] numbers) {
        int numberLength = numbers.length;
        
        int[] answer = new int[numberLength];
        int[] nextIndex = new int[numberLength];
        
        answer[numberLength - 1] = -1;
        nextIndex[numberLength - 1] = -1;
        
        //배열 뒤부터 순회
        for(int i = numberLength - 2; i >= 0; i--){
            
            int searchIndex = i + 1;
            
            while(searchIndex != -1
                            && numbers[i] >= numbers[searchIndex]){
                 searchIndex = nextIndex[searchIndex];
            }
               
            if (searchIndex == -1) {
                answer[i] = -1;
                nextIndex[i] = -1;
            } else {
                answer[i] = numbers[searchIndex];
                nextIndex[i] = searchIndex;
            }
        }
        
        return answer;
    }
}