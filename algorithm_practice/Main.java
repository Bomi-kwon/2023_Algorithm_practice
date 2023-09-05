package algorithm_practice;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < N ; i++) {
			if(i == 0) {
				System.out.print(arr[i] + " ");
			} else {
				if(arr[i-1] < arr[i]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
		
		
	}
}
