class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = new char[my_string.length()];
        for(int i=0; i<my_string.length(); i++) {
        ch[i] = my_string.charAt(my_string.length()-1-i);
        answer += ch[i];    
        }
        return answer;
    }
}