package algorithm_practice;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] arr = new long[n+1];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2 ; i <= n ; i++) {
			arr[i] = (arr[i-2] + arr[i-1])%1234567;
		}
		
		for(int i = 0 ; i <= n ; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
			System.out.printf("arr[%d]를 1234567로 나눈 나머지 : %d\n", i, arr[i]%1234567);
		}
		
 	}
}
