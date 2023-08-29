package algorithm_practice;

import java.util.Scanner;

class Main {
	static boolean flag = false;
	// DFS가 끝났을 때에만 깃발을 들어 끝을 알리겠음
	static int total = 0;
	// 집합 속 원소 총합
	static String answer = "NO";
	static int N = 0;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    
	    int[] arr = new int[N];
	    
	    for(int i = 0 ; i < N ; i++) {
	    	arr[i] = sc.nextInt();
	    	// 원소 N개 짜리 배열에 숫자 N개 넣어주기
	    	total += arr[i];
	    	// 원소 전부 더한 총합 구해야됨
	    }
	    
    	DFS(0, arr[0], arr);
    	// DFS 함수 실행! 0번째 깊이(인덱스)와 합계 기억하기
    	
    	System.out.println(answer);
	  }

	public static void DFS(int depth, int sum, int[] arr) {
		if(flag) {
			return;
			// 이미 만족하는 조건 찾았으면 다른 DFS들 구할 필요 없음!!
		} if(sum > (total - sum)) {
			return;
			// 큰 숫자들을 더해버려서 도중에 목표값을 넘는다? 그럼 할 필요 없음
		} 
		
		if(depth == N-1) {
			// 부분집합이 완성됐을때임!
			// 6개의 원소를 다 넣었다는 소리가 아님.
			// 우리는 각각의 원소를 넣은 경우 안 넣은 경우 모두 계산했으니까.
			if(sum == (total - sum)) {
				flag = true;
				answer = "YES";
				// 목표값에 도달하면 끝났다고 깃발 세우고 더이상 할 필요 없음
			} // 끝까지 와버렸는데 목표값에 도달했으면 YES인 것
			// 그게 아니면 그냥 원래값인 NO로 냅두면 됨
		} else {
			DFS(depth+1, sum + arr[depth+1], arr);
			// 다음 인덱스 값을 더한 DFS 하나랑
			DFS(depth+1, sum, arr);
			// 다음 인덱스 값을 안 더한 DFS 하나 이렇게 총 두개씩 만들어 나가면됨!
		}
	}
}
