package com.msa4java.edu.oop.inheritance;

public class Mammal { // 클래스에 final 붙이면 상속불가
    protected String name; // 나를 상속받고 있는 아이도 사용 가능, 그래서 this로 접근 가능
    // 만약 private 라면 자식쪽에서 상속을 받지 못함. this 사용 불가
    protected String residence;

    public Mammal(String name, String residence){
        this.name = name;
        this.residence = residence;
    } // 하지만 안에 파라미터가 있음 그래서 자식쪽에서 오류 , 정의하는 순간 디폴트 생성자가 없어짐


    public void breath() { //메소드에 final붙이면 오버라이드가 불가능
        System.out.println(this.name + "이/가 폐호흡합니다.");
    }

}
