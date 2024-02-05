class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = numbers;
        for(int i = 0 ; i < answer.length ; i++) {
                int num = 2 * answer[i];
                answer[i] = num;
        }
        return answer;
    }
}