package com.hk.app;

public class Exam0 {

	public static void main(String[] args) {
		
		// 임의의 값으로 나눌 때 에러처리를 하시오
		int num = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			
			// 랜덤한 값으로 num을 나눌 때 예외처리 하시오
			// 랜덤값은 0~9까지 중에서
			int temp = 0;
			try {
				temp = (int)Math.floor(Math.random()*10);
				result = num / temp;
				System.out.println(num +"/" + temp + "=" +result);
			}catch(ArithmeticException e) {
				System.out.println(temp+"로 나눌 수 없습니다");
			}
		}

	}

}
