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
	    // 아래부터는 예시를 보고 바꾼 더 간결한 선택 정렬 알고리즘
	    
	    int indexMin, temp;
	    
	    for(int l = 0; l < N-1; l++) {
	    	indexMin = l;
	    	
		    for(int j = l+1 ; j < N; j++) {
		    	
		    	if(numbers.get(j) < numbers.get(indexMin)) {
		    		
		    		// 만약 indexMin번째 숫자보다 더 작은 숫자가 있다면?
		    		indexMin = j; // indexMin을 그 숫자로 대체
		    	}
		    	// 더 작은 숫자 없으면 안 대체
		    	// j 하나 늘려서 다시 반복
		    }
		    
		    temp = numbers.get(indexMin); 
		    // 그렇게 찾은 가장 작은 숫자를 temp에 집어넣기
		    
		    numbers.set(indexMin, numbers.get(l));
		    // 가장 작은 숫자가 있던 자리에, 맨 앞에 있던 숫자 집어넣기
		    numbers.set(l, temp);
		    // 맨 앞에 가장 작은 숫자 집어넣기. 즉 가장 작은 숫자와 맨 앞 숫자를 swap
		    
		    // 한번 최솟값 찾아서 맨 앞에 넣고 정렬 끝나면,
		    // 이제 맨 앞의 숫자는 무시하고 그 다음 칸부터 다시 똑같이 정렬하기
		    // 반복문 앞에서 자연스럽게 그 다음 칸으로 넘어가게 됨
		    // 그래서 최댓값보다는 최솟값을 기준으로 정렬하는게 나음.
	    }
	    
	    System.out.println(numbers.get(N/2));
	  }
}


