package algorithm_practice;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    for(int i = 0; i < T; i++) {
	    	int N = sc.nextInt();
	    	int[][] triangle = new int[N][N];
	    	// 가로 N줄 세로 N줄인 정사각형 이차원 배열 만들기
	    	
	    	System.out.println("#"+ (i+1) );
	    	// 몇번째 테스트 케이스인지 쓰기 

	    	for(int j = 0 ; j < N ; j++) {
	    		// j번째 줄에서..
	    		
	    		for(int l = 0; l <= j; l++) {
	    			// j번째 줄에는 숫자 j+1개 있음
	    			
	    			if(j == l || l == 0) {
	    				triangle[j][l] = 1;
	    				// 맨 윗줄 숫자는 무조건 1
	    				// 두번째 줄 숫자도 1 1
	    				// 몇번째 줄이던 맨 앞과 맨 뒤는 무조건 1
	    			} else {
	    				triangle[j][l] = triangle[j-1][l-1] + triangle[j-1][l];
	    				// j번째 줄의 l번째 값은 j-1번째 줄의 l-1번째값과 l번째 값의 합과 같음.
	    			}
	    			System.out.printf("%d ",triangle[j][l]);
	    			// 숫자 적고 오른쪽 한칸 띄어쓰기
	    		}
	    		System.out.println("");
	    		// 엔터 한번
	    	}
	    }
	  }
}


