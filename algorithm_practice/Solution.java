package algorithm_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
	    	
	    	List<String> alphabet = new ArrayList<>();
	    	alphabet = Arrays.asList(words[i].split(""));
	    	// 단어를 알파벳 단위로 쪼개 새로운 arraylist에 넣었음
	    	
	    	List<String> reverse_alphabet = new ArrayList<>(alphabet);
	    	// 거꾸로 list를 새로 만들고 원래 리스트를 복사했음
	    	
	    	Collections.reverse(reverse_alphabet);
	    	// 거꾸로 list에서는 배열을 뒤집었음
	    	
	    	for(int j = 0; j < alphabet.size()/2; j++) {
	    		// 배열 길이가 홀수든 짝수든 2로 나눈 몫 만큼의 횟수로 비교하면 됨.
	    		
	    		if(!alphabet.get(j).equals(reverse_alphabet.get(j))) {
	    			t_or_f = 0;
	    			break;
	    			// 원래 배열과 거꾸로 배열의 문자를 앞에서부터 비교하다가
	    			// 서로 다른 문자 나오면 회문이 아니라고 체크한 후 바로 반복문 탈출.
	    		}
	    		
	    		// if 구문에 걸리지 않았다면 회문 문자가 맞으므로 t_or_f 그대로 1로 두기.
	    	}
	    	System.out.printf("#%d %d\n", i+1, t_or_f);
	    }
	  }
}


