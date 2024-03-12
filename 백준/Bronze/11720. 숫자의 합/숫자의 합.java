import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String word = sc.next();
		
		String[] arr = word.split("");

		int sum = 0;
		for(String s : arr) {
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
	}

}
