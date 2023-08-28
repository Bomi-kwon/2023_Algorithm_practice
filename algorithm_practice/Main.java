package algorithm_practice;

import java.util.Arrays;
import java.util.Comparator;
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
	    
	    int athNum = 0;
	    
	    Arrays.sort(ath, new Comparator<int[]>() {
	    	// 선수들 키 큰 순서대로 나열하기!!
	    	
	    	@Override
	    	public int compare(int[] o1, int[] o2) {
	    		if(o1[0] != o2[0]) {
	    			return o2[0] - o1[0];
	    			// 키 기준 내림차순
	    		} else {
	    			return o2[1] - o1[1];
	    			// 키 같으면 몸무게 기준 내림차순
	    		}
	    	}
		});
	    
	    int maxWeight = ath[0][1];
	    // 몸무게 최댓값에 키 제일 큰 사람 몸무게 넣어놓기
	    athNum++;
	    // 키 제일 큰 사람은 무조건 선수로 발탁되야함
	    
	    for(int i = 1 ; i < N ; i++) {
	    	if(ath[i][1] >= maxWeight) {
	    		maxWeight = ath[i][1];
	    		// 만약 비교대상의 몸무게가 최댓값보다 크면 그걸로 최댓값 바꾸고
	    		athNum++;
	    		// 선수 한명 뽑혔으므로 추가해주기
	    	} else {
	    		continue;
	    		// 만약 몸무게가 최댓값보다 작으면 탈락. 최댓값 안 바뀌고 선수로도 안 뽑힘
	    	}
	    }
	    
	    System.out.println(athNum);
		
	  }
}
