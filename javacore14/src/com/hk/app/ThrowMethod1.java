package com.hk.app;

public class ThrowMethod1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 에러가 발생됨 -> 에러 내용을 통해
		method();
	}
	
	// 메소드에 예외처리 넣기
	// 어느 메소드를 호출했을 때 에러가 발생한지를 체크하도록 해준다
	public static void method() throws Exception {
		method2();
	}
	
	// 메소드2에 예외처리 넣기
	public static void method2() throws Exception {
		// 메소드 안에서 에러를 찾는 경우
		// try catch 사용한다
		try {
			throw new Exception(); // 강제적으로 에러 발생
		}catch(Exception e) {
			System.out.println("에러내용:"+e.getMessage());
			e.printStackTrace();
		}
	}

}
