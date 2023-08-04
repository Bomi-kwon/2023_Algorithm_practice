package algorithm_practice;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    for(int i = 0; i < N; i++) {
	    	String word = sc.next();
	    	// 한줄에 적히는 단어 인식하기
	    	
	    	int t_or_f = 0;
	    	// 일단 회문 문자가 아님을 가정하고 풀기 시작
	    	
	    	if(word.equals(new StringBuilder(word).reverse().toString())) {
	    		// word와 똑같은 문자열을 생성한뒤, 뒤집고 문자열로 생성
	    		// 출력하거나 String 변수에 넣을땐 toString()을 붙여야 함.
	    		t_or_f = 1;
	    		// 뒤집었는데 원래랑 똑같으면 회문 문자가 맞다.
	    	} 
	    	
	    	System.out.printf("#%d %d\n", i+1, t_or_f);
	    }
	  }
}


