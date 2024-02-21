import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //정수 갯수 입력
        int N = sc.nextInt();

        //정수 배열 입력
        int[] arr = new int[N];

        //입력받은 정수 배열에 담기
        for(int i = 0; i < N; i++){
            arr[i] = (sc.nextInt());
        }

        //찾을 숫자 입력
        int v = sc.nextInt();

        //배열 돌며 숫자 찾기
        int cnt=0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == v){
                cnt++;
            }
        }
        System.out.println(cnt);

        }
    }
