package algorithm_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			a[i] = sc.nextInt(); // a배열 따로
		}
		
		int M = sc.nextInt();
		int[] b = new int[M];
		
		for(int i = 0 ; i < M ; i++) {
			b[i] = sc.nextInt(); // b배열 따로
		}
		
		int p1 = 0, p2 = 0; // 포인터 두개 만들어주기
		// 포인터들은 각 배열의 인덱스를 가리킴.
		List<Integer> answer = new ArrayList<>(); // 정답리스트
		
		while(p1 < N && p2 < M) {
			if(a[p1] < b[p2]) {
				answer.add(a[p1]);
				p1++;
				// 위 두 줄은 answer.add(a[p1++])로 합칠수 있음.
				// p1++은 p1값을 넣은 다음 1증가 시키겠다는 소리임.
				// 후위연산임!!
			} else {
				answer.add(b[p2]);
				p2++;
			} // p1 == N이거나 p2 == M이면 둘중 한 배열을 다 쓴것!
		}

		while(p1 < N) {
			answer.add(a[p1++]); // 여기선 합쳐서 써봤음
			// 만약 a 배열이 아직 안 끝났으면 나머지 쭈루룩 다 넣기
		}
		while(p2 < M) {
			answer.add(b[p2++]);
			// 만약 b 배열이 아직 안 끝났으면 나머지 쭈루룩 다 넣기
		}
		
		for(int x : answer) {
			System.out.print(x + " ");
		}
	}
}