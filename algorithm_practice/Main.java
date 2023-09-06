package algorithm_practice;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int answer = 0;
		int maxHeight = 0;
		
		for(int i = 0 ; i < N ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < N ; i++) {
			if(i == 0) {
				answer++;
				maxHeight = arr[0];
			} else {
				if(maxHeight < arr[i]) {
					answer++;
					maxHeight = arr[i];
				}
			}
		}
		System.out.println(answer);
	}
}
