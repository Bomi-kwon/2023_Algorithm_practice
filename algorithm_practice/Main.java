package algorithm_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    
	    List<Character> arr = new ArrayList<>(); // 변환한 char 담을 리스트
	    
	    for(char x : str.toCharArray()) {
	    	if(Character.isUpperCase(x)) {
	    		x = Character.toLowerCase(x);
	    	} else {
	    		x = Character.toUpperCase(x);
	    	}
	    	arr.add(x);
	    	// 변환한 뒤 리스트에 담기
	    }
	    
	    StringBuilder sb = new StringBuilder(); // 스트링빌더 이용
	    
	    for(Character ch : arr) {
	    	sb.append(ch); // 리스트 속 char를 하나의 문자열로 엮기
	    }
	    
	    System.out.println(sb.toString());
	}
}
