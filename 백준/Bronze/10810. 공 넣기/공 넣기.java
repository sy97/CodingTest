import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //바구니 갯수
        int N = sc.nextInt();
        //바구니 배열만들기
        int[] arr = new int[N];
        //반복 횟수
        int M = sc.nextInt();

        //범위 및 숫자 변수
        //몇번 바구니부터
        int i = 0;
        //몇번 바구니까지
        int j = 0;
        //어떤 숫자
        int k = 0;

        for(int a =0; a < M; a++){
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            for(int b = i-1; b < j; b++){
                //비어있으면 넣기
                if(arr[b] == 0){
                    arr[b] = k;
                }
                //아니라면 빼고 넣기
                else
                    arr[b] = 0;
                    arr[b] = k;
            }
        }
        //결과출력
         for(int n : arr){
             System.out.print(n+" ");
         }

    }
}