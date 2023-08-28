package algorithm_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    int N = sc.nextInt();
	    int[][] meeting = new int[N][2];
	    
	    for(int i = 0 ; i < N ; i++) {
	    	meeting[i][0] = sc.nextInt();
	    	meeting[i][1] = sc.nextInt();
	    }
	    
	    int meetingNum = 0;
	    
	    Arrays.sort(meeting, new Comparator<int[]>() {
	    	// 회의가 먼저 끝나는 순으로 정렬하기!!
	    	
	    	@Override
	    	public int compare(int[] o1, int[] o2) {
	    		if(o1[1] != o2[1]) {
	    			return o1[1] - o2[1];
	    			// 회의 끝나는 시간 기준 오름차순
	    		} else {
	    			return o1[0] - o2[0];
	    			// 회의 끝시간 같으면 시작시간 기준 오름차순
	    		}
	    	}
		});
	    
	    int frontEnd = meeting[0][1];
	    // 앞 회의 끝난 시간에 가장 먼저 끝난 회의 끝시간 넣어놓기
	    meetingNum++;
	    // 제일 먼저 끝나는 회의는 무조건 해야함
	    
	    for(int i = 1 ; i < N ; i++) {
	    	if(meeting[i][0] >= frontEnd) {
	    		frontEnd = meeting[i][1];
	    		// 만약 다음 회의의 시작시간이 앞회의 끝시간보다 뒤면 그 회의의 끝시간을 앞회의 끝시간으로 바꾸고
	    		meetingNum++;
	    		// 회의 하나 더 추가해주기
	    	}
	    }
	    System.out.println(meetingNum);
	  }
}
