package algorithm_practice;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine().toUpperCase(); // 문자열 입력받아서 대문자로 다 바꾸기
	    
	    char[] arr = str.toCharArray(); // 문자열을 배열로
	    
	    char alphabet = sc.next().toUpperCase().charAt(0);
	    // String으로 입력받아서 대문자로 바꾸고 char로 변환
	    
	    int answer = 0;
	    
	    for(int i = 0 ; i < arr.length ; i++) {
	    	if(alphabet==arr[i]) {
	    		answer++;
	    		// 문자열 안의 알파벳과 문자가 똑같으면
	    		// 갯수 하나씩 증가
	    	}
	    }
	    
	    System.out.println(answer);
	    
	}

}
