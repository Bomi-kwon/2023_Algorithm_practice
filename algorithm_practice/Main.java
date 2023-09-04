package algorithm_practice;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    
	    String answer = "";
	    
	    for(char x : str.toCharArray()) {
	    	if(x >= 65 && x <= 90) {
	    		answer += (char)(x+32);
	    		// 65~90 사이면 대문자
	    		// 대문자에 32를 더하면 소문자됨
	    		// 숫자를 다시 문자로 형변환 해줘야됨
	    	} else {
	    		answer += (char)(x-32);
	    	}
	    }
	    System.out.println(answer);
	}
}
