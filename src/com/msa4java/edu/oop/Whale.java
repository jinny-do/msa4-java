package com.msa4java.edu.oop;

public class Whale {
    // Class는 Field와 Method로 구성되어 있다.
    // 필드는 클래스 내부에 정의된 변수들
    // 메서드는 클래스 내부에 정의된 함수들
    public String name = "고래"; // 클래스 변수 -> 필드
    public static int age = 20; // 인스턴스 생성 없이 그냥 바로 호출 가능

    // Method
    public void swimming() {
        System.out.println("고래가 헤엄칩니다.");
    }

    // Static Method
    public static void breath(String str) { // 파라미터
        System.out.println(str + "고래가 폐호흡합니다.");
    }
}
