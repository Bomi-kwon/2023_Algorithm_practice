package algorithm_practice;

import java.util.Scanner;

public class Main {
	static int maxScore = 0;
	static int Num = 0;
	static int Limit = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    Num = sc.nextInt(); // 문제 갯수
	    Limit = sc.nextInt(); // 제한 시간
	    int sum = 0;
	    
	    int[][] question = new int[Num][2];
	    
	    for(int i = 0 ; i < Num ; i++) {
	    	question[i][0] = sc.nextInt();
	    	question[i][1] = sc.nextInt();
	    	// 점수와 푸는데 걸리는 시간 넣어주기
	    }
	    
	    DFS(0, 0, 0, question);
	    
    	System.out.println(maxScore);
	}

	private static void DFS(int depth, int totalScore, int totalTime, int[][] question) {
		if(totalTime > Limit) {
			return;
			// 문제 푼 시간이 제한 시간 넘어가면 그대로 DFS 끝
		}
		
		if(depth == Num) {
			if(totalTime <= Limit && totalScore > maxScore) {
				maxScore = totalScore;
				// 방금 푼 문제수가 많다면 걔로 값 교체
			}
		} else {
			DFS(depth+1, totalScore+question[depth][0], totalTime + question[depth][1], question);
			// 문제 푼 경우. 그럼 그 시간만큼 더해주기
			DFS(depth+1, totalScore, totalTime, question);
			// 문제 안 품. 그럼 시간 안 더해지고 깊이만 깊어짐.
		}
	}
}
