class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i = 0 ; i < answer.length ; i ++){
            answer[answer.length-1-i] = num_list[i];
        }
        return answer;
    }
}