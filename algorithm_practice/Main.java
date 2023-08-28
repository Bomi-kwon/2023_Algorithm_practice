package algorithm_practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int N = sc.nextInt();
	    int[][] ath = new int[N][2];
	    
	    for(int i = 0 ; i < N ; i++) {
	    	ath[i][0] = sc.nextInt();
	    	ath[i][1] = sc.nextInt();
	    }
	    
	    int athNum = N;
	    
	    for(int i = 0 ; i < N ; i++) {
	    	// i는 기준으로 할 사람의 인덱스임
	    	
	    	for(int j = 0 ; j < N ; j++) {
	    		// j는 비교할 사람의 인덱스임
	    		
	    		if(ath[i][0] < ath[j][0]) {
	    			// 내가 키가 작다면?
	    			
	    			if(ath[i][1] < ath[j][1]) {
	    				// 키도 작고 몸무게도 작으면 나 탈락(비교 끝)
	    				athNum--;
	    				break;
	    			} else {
	    				// 키는 작은데 몸무게는 크면 합격
	    				continue;
	    			}
	    		} else {
	    			// 내가 키 크면 그냥 넘어감
	    			continue;
	    		}
	    	}
	    }
	    
	    System.out.println(athNum);
		
	  }
}
