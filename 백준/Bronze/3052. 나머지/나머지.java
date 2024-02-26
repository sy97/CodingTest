import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열만들기
        int[] arr = new int[10];
        int[] mod = new int[10];
        //입력받은 정수 배열에 담기
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        //나머지값 배열에 담기
        for (int i = 0; i < arr.length; i++) {
            mod[i] = arr[i] % 42;
            }
   
        //중복값제거
        int[] answer = Arrays.stream(mod).distinct().toArray();

        System.out.println(answer.length);
    }
}
    