package algorithm_practice;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    String[] words = new String[N];
	    // 맨 첫줄에 주어진 숫자 길이만큼의 배열을 만들기
	    
	    for(int i = 0; i < N; i++) {
	    	words[i] = sc.next();
	    	// 그 밑줄부터 적히는 단어들 배열에 다 넣기
	    }
	    
	    for(int i = 0; i < N; i++) {
	    	// 배열 한칸씩 그 문자가 회문인지 알아보자.
	    	
	    	int t_or_f = 1;
	    	// 일단 회문 문자임을 가정하고 풀기 시작
	    	
	    	String[] alphabet = words[i].split("");
	    	// 단어를 알파벳 단위로 쪼개 새로운 배열에 넣었음
	    	
	    	for(int j = 0; j < alphabet.length/2; j++) {
	    		// 배열 길이가 홀수든 짝수든 2로 나눈 몫 만큼의 횟수로 비교하면 됨.
	    		
	    		if(!alphabet[j].equals(alphabet[alphabet.length-j-1])) {
	    			t_or_f = 0;
	    			break;
	    			// 만약 마주보는 문자 비교하다가
	    			// 서로 다른 문자 나오면 회문이 아니라고 체크한 후 바로 반복문 탈출.
	    		}
	    		
	    		// if 구문에 걸리지 않았다면 회문 문자가 맞으므로 t_or_f 그대로 1로 두기.
	    	}
	    	System.out.printf("#%d %d\n", i+1, t_or_f);
	    }
	  }
}


