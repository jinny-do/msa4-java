package com.msa4java.edu.generics;

import java.util.Arrays;

public class GenericsMain {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.add(2);
        box1.add(5);

        System.out.println(Arrays.toString(box1.arr));

        Box2<String> box2 = new Box2<>();
        box2.add("test");

        Box2<Integer> box2Int = new Box2<>();
        box2Int.add(1);
    }
}
