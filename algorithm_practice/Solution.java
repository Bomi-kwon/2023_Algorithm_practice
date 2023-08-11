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
	    	// 주어진 것을 담을 2차원 배열 만들기 (정사각형 배열이고 숫자 들어감)
	    	
	    	for(int row = 0 ; row < N ; row++) {
	    		// row번째 행
	    		for(int column = 0 ; column < N ; column++) {
	    			cube[row][column] = sc.nextInt();
	    			// 주어진 숫자들 2차원 배열에 넣기
	    		}
	    	}

	    	System.out.printf("#%d\n",i+1);
	    	// 몇번째 테스트 케이스인지 출력
	    	
	    	for(int row = 0 ; row < N ; row++) {
	    		// 행과 열 자리를 바꾸고, 행이 원래와 순서가 거꾸로 가면 90도 회전한 것임
	    		// 그 규칙만 계속 적용해주면 90도 -> 180도 -> 270도 회전 배열을 담지 않고 바로 출력할 수 있음
	    		for(int column = 0 ; column < N ; column++) {
	    			System.out.print(cube[N-column-1][row]);
	    		}
	    		System.out.print(" ");
	    		
	    		for(int column = 0 ; column < N ; column++) {
	    			System.out.print(cube[N-row-1][N-column-1]);
	    		}
	    		System.out.print(" ");
	    		
	    		for(int column = 0 ; column < N ; column++) {
	    			System.out.print(cube[column][N-row-1]);
	    		}
	    		System.out.println();
	    	}
	    }
	  }
}
