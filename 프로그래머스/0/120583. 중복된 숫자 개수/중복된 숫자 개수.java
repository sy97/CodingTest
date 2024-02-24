class Solution {
    public int solution(int[] array, int n) {
        //중복 셀 변수 선언 
        int count = 0;
        
        //배열돌며 중복 찾기. n과 일치하는 것 있으면 카운트하기.
        for(int a : array){
            if(a == n){
                count++;
            }
        }
        int answer = count;
        return answer;
    }
}