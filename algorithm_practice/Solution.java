package algorithm_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    ArrayList<Integer> numbers = new ArrayList<>();
	    
	    for(int i = 0; i < N; i++) {
	    	numbers.add(sc.nextInt());
	    }
	    
	    // Collections.sort(numbers);
	    
	    int maxNum;
	    int last_index = N-1;
	    int maxNum_index = N-1;
	    
	    for(int l = 0; l <= N-1; l++) {
	    	
	    	
	    	maxNum = numbers.get(0); // maxNum에 0번째 인덱스의 값 넣기
	    	maxNum_index = 0; // maxNum의 인덱스는 0번째
		    
		    for(int j = 0 ; j <= last_index-1 ; j++) {
		    	
		    	if(maxNum < numbers.get(j+1)) {
		    		
		    		// 만약 maxNum의 숫자보다 더 큰 숫자가 있다면?
		    		
		    		maxNum = numbers.get(j+1);
		    		// 그 숫자로 대체
		    		maxNum_index = j+1;
		    		// 그리고 걔의 인덱스도 함께 대체
		    	}
		    	// 더 큰 숫자 없으면 안 대체
		    	// j 하나 늘려서 다시 반복
		    }
		    
		    
		    numbers.set(maxNum_index, numbers.get(last_index));
		    // 원래 최댓값이 있던 인덱스에 원래 맨 뒤에 있던 숫자를 집어넣기
		    numbers.set(last_index, maxNum);
		    // 그리고 맨 뒤 인덱스에 내가 찾은 최댓값을 집어넣기
		    
		    last_index--;
		    // 맨 뒤 인덱스에 최댓값 들어갔으니, 이제 그 앞부분에서 똑같은 행위 반복
	    }
	    
	    System.out.println(numbers.get(N/2));
	  }
}


