import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//문자열 입력
		String str =sc.nextLine().trim();
		
		if(str.equals("")) {
			System.out.println(0);
		}
		
		else {
		System.out.println(str.split(" ").length);
		}
		
		
		
	}

}
