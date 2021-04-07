package com.hk.app;

public class ReThrow1 {

	public static void main(String[] args) throws Exception {
		
		try {
			method1();
		}catch(Exception e) {
			System.out.println("메소드1를 호출시 에러발생");
			System.out.println("에러내용:" +e.getMessage());
		}

	}
	
	public static void method1() throws Exception {
		
		try {
			throw new Exception(); // 강제로 에러 발생
		}catch(Exception e) {
			System.out.println("함수내에 에러확인: 강제로 에러 발생됨");
			System.out.println("에러내용:"+e.getMessage());
			throw e;   // 호출한 곳을 다시 에러를 전송
		}
	}

}
