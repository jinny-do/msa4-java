package com.msa4java.edu.oop.abstractclass;

public class AbstractMain {
    public static void main(String[] args) {
//        Mammal mammal = new Mammal(); X - 추상 클래스라 인스턴스 불가
        Whale whale = new Whale("고래");
        FlyingSquirrel flyingSquirrel = new FlyingSquirrel("날다람쥐");

        whale.residence();
        flyingSquirrel.residence();

        whale.swimming();

        // 다형성
        // 같은 자료형에 여러가지 타입의 데이터를 대입하여 다양한 결과를 얻어낼 수 있는 성질
//        - 클래스의 상속관계에서 나타나는 다채로운 성질
//        - 자바에선 대표적으로 오버로딩, 오버라이딩, 업캐스팅, 다운캐스팅, 인터페이스, 추상메소드, 추상클래스 등이 속한다.
        // 상위타입으로 상속을 받을 수 있다?
        // 상위클래스의 형태를 띨 수 있다.
        // 자식클래스가 부모클래스 타입으로 캐스팅 됨 - 업캐스팅
//        Mammal whale2 = new Whale("고래2");
//        whale2.residence();
        // whale2.swimming(); -> 부모가 swimming()메소드가 없어 쓸 수 없음

        Whale whale2 = new Whale("고래2");
        Mammal castingWhaleToMammal = (Mammal)whale2; // 업캐스팅
        whale2.swimming();
        // castingWhaleToMammal.swimming(); // 자식 클래스가 가진 멤버에는 접근이 불가능
        whale2.breath();
        castingWhaleToMammal.breath(); // 오버라이드 한 경우 자식쪽 오버라이드 한 메소드 실행

        // 다운 캐스팅
        // 업캐스팅한 인스턴스를 다시 본인의 데이터 타입으로 캐스팅 하는 것
        // 업캐스팅을 했던 구현체만 다운캐스팅 가능
        Whale downCastingWhale = (Whale)castingWhaleToMammal;
        downCastingWhale.swimming();

        Whale[] arrWhale = new Whale[3];
        arrWhale[0] = new Whale("고래1");
        arrWhale[1] = new Whale("고래2");
        arrWhale[2] = new Whale("고래3");

        Mammal[] arrMammal = new Mammal[4];
        arrMammal[0] = new Whale("고래1");
        arrMammal[1] = new Whale("고래2");
        arrMammal[2] = new Whale("고래3");
        arrMammal[3] = new FlyingSquirrel("날다람쥐4");
        // 하지만 각 자식이 갖고 있는 메서드는 사용하지 못함 그래서 다운캐스팅 함

        // if로 체크 후 다운캐스팅으로 각 자식 메서드 사용
        for(int i = 0; i < arrMammal.length; i++) {
            Mammal obj = arrMammal[i];
            if(obj instanceof Whale) {
                // 다운 캐스팅
                Whale whale1 = (Whale)obj;
                whale1.swimming();
            } else if(obj instanceof FlyingSquirrel) {
                FlyingSquirrel flyingSquirrel1 = (FlyingSquirrel)obj;
                flyingSquirrel1.residence();
            }
        }


    }
}
