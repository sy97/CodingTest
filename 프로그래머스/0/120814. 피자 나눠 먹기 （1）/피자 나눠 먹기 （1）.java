class Solution {
    public int solution(int n) {
        /*
        아이디어.
        n>7 일 때,
        n / 7 = 몫.
        double로 받은다음에
        무조건 올림으로(Math.ceil)?
        */
        double p1 = Math.ceil((double)n/7);
        int answer = (int)p1;
        
        return answer;
    }
}