package com.msa4java.edu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EduArrayList {
    public static void main(String[] args) {
        // Array List
        List<Integer> list = new ArrayList<>(10);

        list.add(1); // index에 값 추가
        list.add(2);
        list.add(5);
        list.add(4);

        System.out.println(list.get(3)); // 4

        // 정렬
        Collections.sort(list);
        System.out.println(list.get(3)); // 정렬 후 5가 나옴
        System.out.println(list.size()); // 4 실제 가지고 있는 양

        // 향상된 for문
        for(int i : list) { // list의 사이즈만큼 돌아감
            System.out.println(i);
        }

        list.forEach((i) -> {
            System.out.println(i);
        });
    }
}
