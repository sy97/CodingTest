import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수 갯수랑 비교숫자 받아놓을 배열 만들어놓기
        int[] arr = new int[2];

        //정수 갯수 입력
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //정수 배열 입력
        int[] arrs = new int[arr[0]];

        //입력받은 정수 배열에 담기
        for (int i = 0; i < arr[0]; i++) {
            arrs[i] = (sc.nextInt());
        }

        //배열 돌며 숫자 찾기
        for (int i = 0; i < arrs.length; i++) {
            if (arr[1] > arrs[i]) {
                System.out.print(arrs[i]+" ");
            }

        }
    }
}
