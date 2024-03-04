import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 과제 안 내신 분..?
		//총 학생수
		int m = 30;
		//과제 제출한 학생수
		int n = 28;
		
		//과제 제출 목록
		int[] arr = new int[n];
		for(int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
			if(1<=n&&n<=30);
			//중복안되게 해야함
		}
		
		int[] arr_all = new int[m];
		for(int i=0; i<m;i++) {
			arr_all[i]=i+1; }
		//30명 중에서 걸러내기
		 		for(int j=0;j<n;j++) {
					for(int i=0; i<m;i++) {
						if(arr[j]==arr_all[i]) {
							arr_all[i]=0;
						}
					}
				}

				
					for(int z=0; z<m;z++) {
						if(arr_all[z]!=0)
						System.out.println(arr_all[z]);}
						
				
				
				
		}

	}
