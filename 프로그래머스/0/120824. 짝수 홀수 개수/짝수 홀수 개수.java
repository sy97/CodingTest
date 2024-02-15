class Solution {
    public int[] solution(int[] num_list) {
        int evencount=0;
        int oddcount=0;
        int[] answer = new int[2];
        for(int i=0 ; i < num_list.length ; i++) {
            if(num_list[i]%2==0) {
                evencount++;
            }
            else
                oddcount++;
        }
        answer[0]=evencount;
        answer[1]=oddcount;
        return answer;
    }
}