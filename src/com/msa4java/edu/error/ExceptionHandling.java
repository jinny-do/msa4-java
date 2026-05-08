package com.msa4java.edu.error;

public class ExceptionHandling {
    public static void main(String[] args) {
    // 예외처리
        try {
            System.out.println("트라이 시작");

            double result = 10 / 0;

            System.out.println("트라이 끝");
        } catch (ArithmeticException e) {
            // 상세 에러 잡고 싶을 때
            System.out.println("ArithmeticException 에러");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // 최상위 예외 객체
            // 웬만한 에러는 다 잡음
            System.out.println("캐치 들어옴");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("파이널리");
        }
    }
}
