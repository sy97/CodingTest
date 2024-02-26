import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열만들기
        int[] arr = new int[9];

        //입력받은 정수 배열에 담기
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        
        //배열 돌며 최대, 최소 찾기
        int max = arr[0];
        //카운트 변수
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }

        }
        System.out.println(max);
        System.out.println(index+1);
    }
}