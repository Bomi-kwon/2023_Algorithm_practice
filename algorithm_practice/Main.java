package algorithm_practice;

import java.util.ArrayList;
import java.util.Arrays;
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
		
		Arrays.sort(a);
		Arrays.sort(b);
		// a배열과 b배열 모두 오름차순으로 정렬
		
		int p1 = 0, p2 = 0; // 포인터 두개 만들어주기
		// 포인터들은 각 배열의 인덱스를 가리킴.
		
		List<Integer> answer = new ArrayList<>(); // 정답리스트
		
		while(p1 < N && p2 < M) {
			if(a[p1] < b[p2]) {
				p1++;
				// 그럼 a[p1]은 절대 똑같은 값이 나올리가 없으므로
				// p1은 그 다음을 가리키기
			} else if(a[p1] == b[p2]){
				answer.add(a[p1]);
				p1++;
				p2++;
				// 둘이 똑같으면 정답 리스트에 넣고
				// p1이랑 p2둘다 다음걸로 넘어가서 비교하기
			} else {
				p2++;
				// 그럼 b[p2]는 절대 똑같은 값이 나올리가 없으므로
				// p2는 그 다음을 가리키기
			}
			// p1 == N이거나 p2 == M이면 둘중 한 배열을 다 쓴것!
			// 그럼 똑같은 수가 절대 없다는 것이므로 여기서 반복문 끝.
		}
		
		for(int x : answer) {
			System.out.print(x + " ");
		}
	}
}