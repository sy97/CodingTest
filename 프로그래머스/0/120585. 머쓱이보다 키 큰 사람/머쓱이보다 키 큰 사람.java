class Solution {
    public int solution(int[] array, int height) {
        /*배열에서 꺼내서 n이랑 비교하고,
        n보다 큰 경우 새 배열에 담기.
        담은 후 , 배열의 길이를 return하기.*/
        int answer = 0;
        int count = 0;
        
        for(int i = 0 ; i < array.length ; i ++) {
            if (array[i] > height) {
                count ++;
            }
        }
        answer = count;
        return answer;
    }
}