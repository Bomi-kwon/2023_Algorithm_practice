package algorithm_practice;

import java.util.ArrayList;
import java.util.Collections;
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
		
		Collections.sort(num); // 오름차순 정렬
		
		for(int x : num) {
			System.out.print(x + " ");
		}
	}
}