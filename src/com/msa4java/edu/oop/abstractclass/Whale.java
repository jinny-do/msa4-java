package com.msa4java.edu.oop.abstractclass;

public class Whale extends Mammal implements Swim {
    public Whale(String name) {   // 생성자
        super(name,"바다");
    }

    @Override
    public void residence() {
        String result = String.format("%s %s에 삽니다.", this.name, this.residence);
        System.out.println(result);
    }

    @Override
    public void breath() {
        System.out.println("고래쪽에서 오버라이드");
    }

    public void swimming() {
        String result = String.format("%s 육중하게 헤엄칩니다.", this.name);
        System.out.println(result);
    }

}
