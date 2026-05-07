package com.msa4java.edu.oop.inheritance;

public class Whale extends Mammal {

    public Whale(String name, String residence) {
//        super(); - super메소드가 생략되어있다. (생성자 안에서만), 파라미터가 없는 생성자 호출
        // super() : 부모의 생성자를 호출하는 메소드
        super(name, residence); // 이 경우 super 직접 호출하여 세팅
//        this.name = name;
//        this.residence = residence;  super로 직접 세팅했으니 필요 없음

        // 자식쪽 생성자에서는 명확하게 부모의 생성자를 호출하는 처리가 들어가야함
        // 그래서 자식쪽 생성자를 생략할 수 없음
        // 부모쪽에 디폴트 생성자가 없기 때문에
    }

    // 오버라이딩 : 부모가 가지고 있는 메소드를 자식쪽에서 같은 이름으로 재정의
    // 자식 클래스에서 부모 클래스의 메소드를 재정의 하는 것
    @Override
    public void breath() {
        // super 키워드 : 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스가 참조하기 윟 사용하는 참조변수
        super.breath();
        System.out.println(this.name + "이/가 폐호흡을 하고, 숨을 잘 참습니다.");
    }

    public void swimming() {
        System.out.println(this.name + "이/가 헤엄칩니다.");
    }
}