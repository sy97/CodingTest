class Solution {

    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        /* 분모랑 분자 구하기 */
        /*분모*/
        int a = denom1 * denom2;
        /*분자*/
        int b = (numer1 * denom2) + (denom1 * numer2);
        
        int gcdValue = gcd(a,b);
         
        int[] answer = {b/gcdValue, a/gcdValue};
        return answer;
        
    }
       /* 최대공약수 구하기*/
        public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
        }    
       
    }