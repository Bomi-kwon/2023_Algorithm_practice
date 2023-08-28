package algorithm_practice;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) {
		
		int people[] = {70, 80, 50, 60, 50, 30};
		// collections 함수를 사용하려면 int 안되고 Integer여야함
		
		Integer weight[] = Arrays.stream(people).boxed().toArray(Integer[]::new);
		// 그래서 int배열을 Integer 배열로 바꾸기
		
		int limit = 100;
		// 보트 하나당 무게 제한
		
		int boatNum = 0;
		// 구명보트 갯수 0으로 시작
		
		Arrays.sort(weight, Collections.reverseOrder());
		// 몸무게 내림차순으로 재배열
		
		System.out.println("몸무게순으로 내림차순한 배열 : " + Arrays.toString(weight));
		
		int end = weight.length - 1;
		// 몸무게 제일 작은애 인덱스
		
		for(int start = 0 ; start < weight.length ; start++) {
			
			if(weight[start] + weight[end] <= limit) {
				boatNum++;
				end--;
				// 제일 무거운애랑 제일 가벼운애 더해서 리밋 안 넘으면
				// 보트에 넣고 맨 뒤 인덱스도 한칸 앞으로
			} else {
				boatNum++;
				// 근데 만약 둘이 더해서 리밋 넘으면
				// 맨 뒤 인덱스 유지. 맨 앞 인덱스는 반복문 때문에 자동 증가
			}
			
			if(start >= end) {
				break;
				// 앞의 인덱스가 뒤의 인덱스보다 크거나 같으면 보트에 다 탄 것
			}
		}
		System.out.println(boatNum);
  }
}
