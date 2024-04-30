

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	
    	int[][] A = new int[N][M];
    	int[][] B = new int[N][M];
    	
    	//더해준 값 담을 배열
    	int[][] result = new int[N][M];
    	
    	//배열 A만들기
    	for(int i=0; i < N; i++) {
    		for(int j=0; j < M ; j++) {
    			A[i][j] = sc.nextInt();
    		}
    	}
    	
    	//배열 B만들기
    	for(int i=0; i < N; i++) {
    		for(int j=0; j < M ; j++) {
    			B[i][j] = sc.nextInt();
    		}
    	}
    	
    	//더하기
    	for(int i=0; i < N; i++) {
    		for(int j=0; j < M; j ++) {
    			result[i][j] = A[i][j] + B[i][j];
    		}
    	}
    	
    	for(int i=0; i < N; i++) {
    		for(int j=0; j< M; j++) {
    			System.out.print(result[i][j] + " ");
    		}
    		
    		System.out.println();
    	}
    }
}