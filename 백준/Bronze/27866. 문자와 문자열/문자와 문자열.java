import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//단어
		String S= sc.nextLine();
		
		//몇번째
		int i = sc.nextInt();
		
		System.out.println(S.charAt(i-1));
				
	}

}
