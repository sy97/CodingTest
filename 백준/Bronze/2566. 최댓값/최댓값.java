import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	//배열만들기
    	int[][] nums = new int[9][9];
    	
    	for(int i = 0; i < 9; i++) {
    		for(int j = 0; j < 9; j++) {
    			nums[i][j] = sc.nextInt();
    		}
    	}
    	
    	int max = 0;
    	int[] index = new int[2];
    	
    	//최댓값 찾기
    	for(int i = 0; i < 9; i++) {
    		for(int j = 0; j < 9; j++) {
    			if(nums[i][j] >= max) {
    				max = nums[i][j];
    				index[0] = i+1;
    				index[1] = j+1;
    			}
    		}
    	}
    	System.out.println(max);
    	System.out.println(index[0]+" "+index[1]);
    }
}