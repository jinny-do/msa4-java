package com.msa4java.edu.oop.basic;

public class Marine {
    private int hp;
    private int damage;
    private int armor;


    public Marine() {
        this(40, 6, 0);
    }

    public Marine(int hp) {
        this(hp, 6, 0);
    }

    public Marine (int hp, int damage, int armor) {
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
    }

    // getter Method
    // 읽을수는 있되, 수정은 불가 (읽기만 가능)
    public int getHp() {
        return this.hp;
    }
    public int getDamage() {
        return this.damage;
    }
    public int getArmor() {
        return this.armor;
    }

    // setter
    // 값을 담고 싶을 때 사용 (대입만 가능)
    public void setHp(int hp) {
        this.hp = hp;
    }

}
