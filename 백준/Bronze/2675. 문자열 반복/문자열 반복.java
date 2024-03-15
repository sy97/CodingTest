import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스
		int T = sc.nextInt();
		
		//몇번 돌지 담을 배열
		int[] loop = new int[T];
		
		//문자열 담을 배열
		String[] str = new String[T];
		
		//테스트케이스 갯수만큼 루프횟수, 문자열 담기
		for(int i = 0; i < T; i++) {
			loop[i] = sc.nextInt();
			str[i] = sc.next();
		}
		
		//테스트케이스 횟수만큼
		for(int i = 0; i < T; i ++) {
			//문자열 한글자씩 분리하기.
			for(int k = 0; k < str[i].length(); k ++) {
				char c = str[i].charAt(k);
				//char형을 string형으로 변환하기
				String s = Character.toString(c);
				//loop만큼 돌며 반복출력
				for(int j = 0; j < loop[i]; j++) {
					System.out.print(s);
	
				}
				
			}
			System.out.println();
			
		}
		
	}

}
