package algorithm_practice;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    // 테스트 케이스 갯수
	    
	    for(int i = 0; i < T; i++) {
	    	int N = sc.nextInt();
	    	int[][] cube = new int[N][N];
	    	int[][] degree_90 = new int[N][N];
	    	int[][] degree_180 = new int[N][N];
	    	int[][] degree_270 = new int[N][N];
	    	// 주어진 것과 돌릴 것들을 담을 2차원 배열 만들기 (다 정사각형 배열이고 숫자 들어감)
	    	
	    	for(int row = 0 ; row < N ; row++) {
	    		// row번째 행
	    		for(int column = 0 ; column < N ; column++) {
	    			cube[row][column] = sc.nextInt();
	    			// 주어진 숫자들 2차원 배열에 넣기
	    		}
	    	}
	    	
	    	for(int row = 0 ; row < N ; row++) {
	    		for(int column = 0 ; column < N ; column++) {
	    			degree_90[row][column] = cube[N-column-1][row];
	    			// 90도 회전하면?
	    			// 행과 열이 바뀌고 row는 숫자가 거꾸로 감소
	    		}
	    	}
	    	
	    	for(int row = 0 ; row < N ; row++) {
	    		for(int column = 0 ; column < N ; column++) {
	    			degree_180[row][column] = degree_90[N-column-1][row];
	    			// 한번더 회전해서 180도 배열에 넣기
	    		}
	    	}

	    	for(int row = 0 ; row < N ; row++) {
	    		for(int column = 0 ; column < N ; column++) {
	    			degree_270[row][column] = degree_180[N-column-1][row];
	    			// 한번더 회전해서 270도 배열에 넣기
	    		}
	    	}
	    	

	    	System.out.printf("#%d\n",i+1);
	    	// 몇번째 테스트 케이스인지 출력
	    	
	    	for(int row = 0 ; row < N ; row++) {
	    		for(int column = 0 ; column < N ; column++) {
	    			System.out.print(degree_90[row][column]);
	    		}
	    		System.out.print(" ");
	    		
	    		for(int column = 0 ; column < N ; column++) {
	    			System.out.print(degree_180[row][column]);
	    		}
	    		System.out.print(" ");
	    		
	    		for(int column = 0 ; column < N ; column++) {
	    			System.out.print(degree_270[row][column]);
	    		}
	    		System.out.println();
	    	}
	    	
	    }
	  }
}

