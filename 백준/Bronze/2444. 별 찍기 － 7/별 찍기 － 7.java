import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//1~5
		for(int i = 1; i <= num ; i++) {
			
			//공백
			for(int j = 1; j <= (num-i) ; j++) {
				System.out.print(" ");
			}
			
			//별
			for(int k = 1; k <= (2*i)-1 ; k++ ) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		//6~9
		for(int i = num-1; i >=1; i--) {
			//공백
			for(int j = 1; j <= num-i ; j++){
				System.out.print(" ");
			}
			
			//별
			for(int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}