import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] s = new String[T];
		sc.nextLine();
		
		for(int i = 0; i < s.length; i++) {
			s[i] = sc.nextLine();
		}
		
		for(int i = 0; i < s.length; i++) {
			System.out.print(s[i].charAt(0));
			System.out.print(s[i].charAt(s[i].length()-1));
			System.out.println();
		}
	}

}
