package com.hk.app;

public class Try1 {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 0;
		
		System.out.println("1번 코드 수행중입니다!");
		//  컴파일에서는 오류가 나오지 않는다
		// 이런경우 오류를 처리할 수 있도록 해주는 코드 => 예외처리 코드
		try {
			System.out.println("2번 코드 수행중입니다!");
			int result = a / b;	// 에러가 발생
			System.out.println("결과는:"+result);
			System.out.println("3번 코드 수행중입니다!");
		}catch(Exception e) {
			// try{} 엔 코드가 예외가 발생하면
			// catch{} 안에서 처리하는 코드를 입력한다
			System.out.println("0으로 나눌 수 없습니다 값을 확인하시오");
			System.out.println("4번 코드 수행중입니다!");
		}
		
		System.out.println("5번 코드 수행중입니다!");
		
		

	}

}
