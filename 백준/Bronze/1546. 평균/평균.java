import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//과목수
		int N = sc.nextInt();
		
		//배열 생성
		int[] arr = new int[N];
		
		//성적 부여
		for(int i = 0; i < N ; i ++ ) {
			arr[i] = sc.nextInt();
		}
		
		//최댓값 찾기
		int max = 0;
		for(int i = 0; i < N; i++ ) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		double sum = 0;
		double avg = 0;
		for(int i = 0; i < N; i++) {
			sum += ((double)arr[i]/max)*100;
		}
		
		avg = sum/N;
		
		System.out.println(avg);
	}

}
