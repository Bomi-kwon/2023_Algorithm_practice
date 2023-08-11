package algorithm_practice;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		// 테스트 케이스는 총 T개 일 것이다.
		
		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();
			// Command 갯수는 총 N개이다.
			
			int speed = 0;
			// 초기 속도는 0이다.
			
			int distance = 0;
			// 초기 이동거리도 0이다.
			
			for(int j = 0; j< N; j++) {
				
				int p_or_m = sc.nextInt();
				// 가속인지 감속인지 구분
				
				if(p_or_m != 0) {
					// 0이면 다음 숫자 없음. 가속/감속이면 얼만큼 할건지 뒤에 숫자 있음
					int how_much = sc.nextInt();
					
					if(p_or_m == 1) {
						speed += how_much;
						// 가속이면 뒤 숫자만큼 속도 커짐
					} else if(p_or_m == 2) {
						speed -= how_much;
						// 감속이면 뒤 숫자만큼 속도 작아짐
						if(speed < 0) {
							// 그렇게 계산을 했는데 속도가 마이너스가 될 경우
							// 그냥 속도 0으로 계산
							speed = 0;
						}
					}
				}
				
				distance += speed;
				// 이전 command까지 이동했던 거리에 새롭게 이동한 거리 추가해주기
				// 1초동안 이동하는 거라 speed가 곧 이동거리를 의미
			}
			System.out.printf("#%d %d\n", i+1, distance);
		}
	}
}
