package algorithm_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int limit = 0;
	static int N = 0;
	static int maxWeight = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    limit = sc.nextInt();
	    N = sc.nextInt();
	    int sum = 0;
	    
	    List<Integer> weights = new ArrayList<>();
	    
	    for(int i = 0 ; i < N ; i++) {
	    	weights.add(sc.nextInt());
	    	// 숫자 N개 넣어주기
	    }
	    
	    Collections.sort(weights, Collections.reverseOrder());
	    // 몸무게 무거운 순으로 (내림차순) 정렬
	    
	    DFS(0, sum, weights);
	    
    	System.out.println(maxWeight);
	  }

	private static void DFS(int depth, int sum, List<Integer> weights) {
		if(sum >= limit) {
			return;
			// 도중에 리밋을 넘어버리면 더이상 더할 필요조차 없음.
		}
		
		if(depth == N) {
			// 모든 몸무게를 넣을지 말지 조합을 다 끝내면 이제 끝내면 됨
			if(sum <= limit && maxWeight <= sum) {
				maxWeight = sum;
				// sum에서 큰 게 나올때마다 계속해서 몸무게 최댓값을 걔로 교체
			}
		} else {
			DFS(depth+1, sum + weights.get(depth), weights);
			DFS(depth+1, sum, weights);
		}
	}
}
