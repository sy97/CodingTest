class Solution {
    public int solution(int slice, int n) {
        /*
        아이디어
        n % slice != 0
        n/ slice 
        */
        int answer = 0;
        if(n % slice != 0) {
        double p1 = Math.ceil((double)n / slice);
            answer = (int)p1;
        }
        else {
            answer = n / slice;
        }
        
        return answer;
    }
}