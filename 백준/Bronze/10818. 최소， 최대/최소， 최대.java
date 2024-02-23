import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수 갯수 입력
        int N = sc.nextInt();
        int[] arr = new int[N];

        //입력받은 정수 배열에 담기
        for (int i = 0; i < N; i++) {
            arr[i] = (sc.nextInt());
        }

        //배열 돌며 최대, 최소 찾기
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            else if(min > arr[i]){
                min = arr[i];
            }

        }
        System.out.println(min + " " + max);
    }
}
