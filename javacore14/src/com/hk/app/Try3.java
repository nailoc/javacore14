package com.hk.app;

public class Try3 {

	public static void main(String[] args) {
		
		// 런타입 Exception = 개발자 잘못입력해서 발생 에러
		// 수학계산이 잘못된경우
		// 인덱스가 잘못된 경우
		int[] scores = new int[3];  // 0 1 2 => 인덱스
		scores[0] = 100;
		scores[1] = 50;
		scores[2] = 0;
		int sum = 0;
		double avg = 0;
		try {
			// 합계을 구하시오
			for(int i=0; i<scores.length; i++) {  // 인덱스 오류 0 1 2 3
				sum += scores[i];                  // 3은 없음
			}
			// 평균을 구하시오
			avg = sum / 0;						// 계산 오류 나누기 오류 
			
			System.out.println(sum);
			System.out.println(avg);
		}catch(IndexOutOfBoundsException e) {    // 인덱스가 잘못사용한 경우
			System.out.println("오류내용:"+e.getMessage()+"인덱스값이 맞지 않습니다");
		}catch(ArithmeticException e2) {
			System.out.println("오류내용:"+e2.getMessage());
		}catch(Exception e3) {
			System.out.println("모든 경우에 대해서 에러를 처리 가능하다");
		}
		

	}

}
