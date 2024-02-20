class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        for(int i = 0 ; i < charArr.length ; i ++) {
            for(int j = 0; j < n ; j++) {
                answer += charArr[i];
            }
            
            }
        return answer;
        }
        
    }