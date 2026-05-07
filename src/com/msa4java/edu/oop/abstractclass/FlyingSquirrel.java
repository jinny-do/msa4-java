package com.msa4java.edu.oop.abstractclass;

public class FlyingSquirrel extends Mammal{
    public FlyingSquirrel(String name) {
        super(name,"산");
    }

    @Override
    public void residence() {
        String result = String.format("%s에 산다. %s", this.residence, this.name);
        System.out.println(result);
    }
}
