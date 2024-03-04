import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //바구니 갯수
        int M = sc.nextInt();
        //역순 방법 횟수
        int N = sc.nextInt();

        //배열생성
        int[] arr = new int[M];

        //배열에 숫자넣기
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        for(int cnt = 0; cnt < N; cnt++){
            //N번 반복
            int i = sc.nextInt();
            int j = sc.nextInt();
            for(int k = i; k < j; k++) {
                int temp = arr[j-1];
                arr[j-1] = arr[k-1];
                arr[k-1] = temp;
                //j를 점점 줄여줘야 가운데것들도 교환됨.
                j--;
            }
        }

        
        for(int n : arr) {
            System.out.print(n+" ");

        }

    }
}
