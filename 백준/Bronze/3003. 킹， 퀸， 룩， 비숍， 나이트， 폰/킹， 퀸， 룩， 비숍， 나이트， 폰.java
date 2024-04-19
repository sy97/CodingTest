import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//체스 배열
		int[] chess = new int[6];
		chess[0] = 1;
		chess[1] = 1;
		chess[2] = 2;
		chess[3] = 2;
		chess[4] = 2;
		chess[5] = 8;
		
		//입력받기
		Scanner sc = new Scanner(System.in);
		int[] userNums = new int[6];
		for(int i =0 ; i < userNums.length; i++) {
			userNums[i] = sc.nextInt();
		}
	
		//빼주기
		for(int i=0; i < chess.length; i++) {
			System.out.print(chess[i] - userNums[i] + " ");
		}
	}

}