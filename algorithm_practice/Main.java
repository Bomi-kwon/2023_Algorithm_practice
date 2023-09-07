package algorithm_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		List<Integer> num = new ArrayList<>();
		
		for(int i = 0 ; i < N ; i++) {
			num.add(sc.nextInt());
		}
		
		int M = sc.nextInt();
		
		for(int i = 0 ; i < M ; i++) {
			num.add(sc.nextInt());
		}
		
		// Collections.sort(num);
		// 함수 사용하지 않고 오름차순 정렬해보기!!
		
		int minNumIndex;
		int box;
		
		for(int i = 0 ; i < N+M ; i++) {
			minNumIndex = i;
			// 일단 제일 앞 값이 최솟값이라고 하기
			
			for(int j = i ; j < N+M ; j++) {
				if(num.get(j) < num.get(minNumIndex)) {
					minNumIndex = j;
					// 더 작은 숫자 나오면 걔로 대체
				}
			}
			
			box = num.get(i); // 제일 앞 값을 다른 곳으로 빼놓고
			num.set(i, num.get(minNumIndex)); // 제일 앞에 최솟값 집어넣기
			num.set(minNumIndex, box); // 최솟값 있던 곳에는 제일 앞값넣기
		}
		
		for(int x : num) {
			System.out.print(x + " ");
		}
	}
}