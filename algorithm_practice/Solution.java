package algorithm_practice;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    for(int i = 0; i < N; i++) {
	    	String word = sc.next();
	    	// 한줄에 적히는 단어 인식하기
	    	
	    	int t_or_f = 1;
	    	// 일단 회문 문자임을 가정하고 풀기 시작
	    	
	    	for(int j = 0; j < word.length()/2; j++) {
	    		// 배열 길이가 홀수든 짝수든 2로 나눈 몫 만큼의 횟수로 비교하면 됨.
	    		
	    		if(word.charAt(j) != word.charAt(word.length()-j-1)) {
	    			t_or_f = 0;
	    			break;
	    			// 마주보는 문자끼리 비교하다가
	    			// 서로 다른 문자 나오면 회문이 아니라고 체크한 후 바로 반복문 탈출.
	    		}
	    		
	    		// if 구문에 걸리지 않았다면 회문 문자가 맞으므로 t_or_f 그대로 1로 두기.
	    	}
	    	System.out.printf("#%d %d\n", i+1, t_or_f);
	    }
	  }
}


