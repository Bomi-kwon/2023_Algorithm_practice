package algorithm_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    
	    String answer = "";
	    
	    for(char x : str.toCharArray()) {
	    	if(Character.isUpperCase(x)) {
	    		answer += Character.toLowerCase(x);
	    	} else {
	    		answer += Character.toUpperCase(x);
	    	}
	    }
	    
	    System.out.println(answer);
	}
}
