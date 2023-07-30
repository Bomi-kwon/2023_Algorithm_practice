package algorithm_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    ArrayList<Integer> numbers = new ArrayList<>();
	    
	    for(int i = 1; i <= N; i++) {
	    	numbers.add(sc.nextInt());
	    }
	    
	    Collections.sort(numbers);
	    
	    System.out.println(numbers.get((N+1)/2-1));
	    
	  }
}

