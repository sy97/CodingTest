class Solution {
    public int solution(int n) {
        /*
        아이디어
        피자판수 * 6 % 사람수 == 0 일때까지
        반복문을 돌려야하나? 
        */
        int answer = 0;
        
        for(int i = 1 ; ;i++) {
            if(i*6 % n == 0) {
            answer = i;
            break;
        }
    }
        
       
        return answer;
    }
}