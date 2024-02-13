class Solution {
    public int[] solution(String[] strlist) {
        /*배열에서 하나씩 꺼내서,
        .length()사용한 후, answer 배열에 담기
        */
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}