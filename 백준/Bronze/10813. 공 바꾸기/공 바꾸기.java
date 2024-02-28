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

        //바구니에 공넣기
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        //바꿀바구니
        //몇번 바구니랑
        int i = 0;
        //몇번 바구니
        int j = 0;
        
        //바꾸기
        for(int a =0; a < M; a++){
            i = sc.nextInt()-1;
            j = sc.nextInt()-1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
        }
        //결과출력
         for(int n : arr){
             System.out.print(n+" ");
         }

    }
}
